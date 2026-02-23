import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    TemperatureConverter converter = new TemperatureConverter();

    @Test
    void fahrenheitToCelsius() {
        assertEquals(0, converter.fahrenheitToCelsius(32), 0.01);
        assertEquals(100, converter.fahrenheitToCelsius(212), 0.01);
        assertEquals(-40, converter.fahrenheitToCelsius(-40), 0.01);
    }

    @Test
    void celsiusToFahrenheit() {
        assertEquals(32, converter.celsiusToFahrenheit(0), 0.01);
        assertEquals(212, converter.celsiusToFahrenheit(100), 0.01);
        assertEquals(-40, converter.celsiusToFahrenheit(-40), 0.01);
    }

    @Test
    void isExtremeTemperature() {
        assertTrue(converter.isExtremeTemperature(-50));
        assertFalse(converter.isExtremeTemperature(20));
        assertTrue(converter.isExtremeTemperature(60));

    }

    @Test
    void celsiusToKelvin() {
        assertEquals(273.15, converter.celsiusToKelvin(0), 0.01);
        assertEquals(373.15, converter.celsiusToKelvin(100), 0.01);
        assertEquals(233.15, converter.celsiusToKelvin(-40), 0.01);
    }

    @Test
    void kelvinToCelsius() {
        assertEquals(0, converter.kelvinToCelsius(273.15), 0.01);
        assertEquals(100, converter.kelvinToCelsius(373.15), 0.01);
        assertEquals(-40, converter.kelvinToCelsius(233.15), 0.01);
    }
}