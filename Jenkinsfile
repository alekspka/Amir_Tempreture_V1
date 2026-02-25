pipeline {
    agent any
    tools {
    maven "Maven3"
    }

    environment {
    PATH = "c:\\Program File\\Docker\\Docker\\resources\\bin;${env.PATH}"
    DOCKERHUB_CREDENTIALS_ID = "Docker_hub"
    DOCKERHUB_REPO = "alekspka/temperatureconverter"
    DOCKER_IMAGE_TAG = "latest"
    }
    stages {
        stage ("Checkout") {
            steps {
                echo "git https://github.com/alekspka/Amir_Tempreture_V1"
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
        stage ("Build Docker Image") {
            steps {
                script{
                docker.build("${DOCKERHUB_REPO}:${DOCKER_IMAGE_TAG}")
                }
            }
        }
        stage ("Push Docker Image to Docker Hub") {
            steps {
                script {
                    docker.withRegistry('https://index.docker.io/v1/', DOCKERHUB_CREDENTIALS_ID) {
                        docker.image("${DOCKERHUB_REPO}:${DOCKER_IMAGE_TAG}").push()
                    }
                }
            }
        }
    }
}