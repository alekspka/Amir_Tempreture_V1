# Temperature Converter

A Java utility library for converting between different temperature scales (Celsius, Fahrenheit, and Kelvin).

## Features

- **Celsius ↔ Fahrenheit conversion**
- **Celsius ↔ Kelvin conversion**
- **Extreme temperature detection** (identifies temperatures below -40°C or above 50°C)

## Project Structure

```
src/
├── main/java/
│   └── TemperatureConverter.java
└── test/java/
    └── TemperatureConverterTest.java
```

## Requirements

- Java 8 or higher
- Maven 3.6 or higher

## Building the Project

```bash
mvn clean build
```

## Running Tests

```bash
mvn test
```

## Code Coverage

Generate code coverage report using JaCoCo:

```bash
mvn clean test jacoco:report
```

The coverage report will be available in `target/site/jacoco/index.html`

## Usage

```java
// Celsius to Fahrenheit
double fahrenheit = TemperatureConverter.celsiusToFahrenheit(25.0);  // 77.0

// Fahrenheit to Celsius
double celsius = TemperatureConverter.fahrenheitToCelsius(77.0);  // 25.0

// Celsius to Kelvin
double kelvin = TemperatureConverter.celsiusToKelvin(0.0);  // 273.15

// Kelvin to Celsius
double celsius = TemperatureConverter.kelvinToCelsius(273.15);  // 0.0

// Check for extreme temperatures
boolean isExtreme = TemperatureConverter.isExtremeTemperature(-50.0);  // true
```

## Testing

The project includes comprehensive JUnit 5 tests covering all conversion functions:
- Temperature conversion accuracy
- Edge cases and boundary values
- Round-trip conversions

Run tests with:
```bash
mvn test
```

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Author

Amir
