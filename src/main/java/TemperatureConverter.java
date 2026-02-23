public class TemperatureConverter {

    public static double fahrenheitToCelsius (double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    public static double celsiusToFahrenheit (double celsius) {
        return (celsius * 1.8) + 32;
    }

    public static double celsiusToKelvin (double celsius){
        return celsius + 273.15;
    }

    public static double kelvinToCelsius (double kelvin){
        return kelvin - 273.15;
    }

    public static boolean isExtremeTemperature (double celsius) {
        if (celsius < -40 || celsius > 50) {
            return true;
        }
        return false;
    }
}
