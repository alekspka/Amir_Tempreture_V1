pipeline {
    agent any
    tools {
    maven "Maven3"
    }

    environment {
    PATH = "C:\\Program Files\\Docker\\Docker\\resources\\bin;${env.PATH}"
    DOCKERHUB_CREDENTIALS_ID = "Docker_hub"
    DOCKERHUB_REPO = "alekspka/temperatureconverter"
    DOCKER_IMAGE_TAG = "latest"
    }
    stages {
        stage ("Checkout") {
            steps {
                git branch: 'main', url: 'https://github.com/alekspka/Amir_Tempreture_V1'
            }
        }

        stage ("build") {
            steps {
                bat "mvn clean install"
            }
        }
        stage ("Generate report") {
            steps {
                bat "mvn jacoco:report"
            }
        }

        stage('Publish Test Results') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }

        stage ("Publish Coverage report") {
            steps {
            jacoco ()
            }
         }
         stage('Build Docker Image') {
             steps {
                bat "docker build -t %DOCKERHUB_REPO%:%DOCKER_IMAGE_TAG% ."
             }
         }
        stage ("Push Docker Image to Docker Hub") {
            steps {
                withCredentials([usernamePassword(credentialsId: "${DOCKERHUB_CREDENTIALS_ID}", usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) {
                    bat """
                        echo %DOCKER_PASSWORD% | docker login -u %DOCKER_USERNAME% --password-stdin
                        docker push %DOCKERHUB_REPO%:%DOCKER_IMAGE_TAG%
                        docker logout
                    """
                }
            }
        }
    }
}