public class TemperatureConverter {

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        System.out.println("32°F = " + converter.fahrenheitToCelsius(32) + "°C");
    }

    public double fahrenheitToCelsius (double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    public double celsiusToFahrenheit (double celsius) {
        return (celsius * 1.8) + 32;
    }

    public double celsiusToKelvin (double celsius){
        return celsius + 273.15;
    }

    public double kelvinToCelsius (double kelvin){
        return kelvin - 273.15;
    }

    public boolean isExtremeTemperature (double celsius) {
        if (celsius < -40 || celsius > 50) {
            return true;
        }
        return false;
    }
}
