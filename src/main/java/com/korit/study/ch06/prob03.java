package com.korit.study.ch06;

public class prob03 {
    public static void main(String[] args) {
        double celsius = 32.5;
        double fahreheit = celsiusToFahrenheit(celsius);
        double celsius2 = fahrenheitToCelsius(fahreheit);
        checkTemperatureConversion(celsius);
    }
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void checkTemperatureConversion(double celsius) {
        double fahreheit = celsiusToFahrenheit(celsius);
        double celsius2 = fahrenheitToCelsius(fahreheit);
        System.out.println(celsius ==celsius2 ? "o" : "x");
    }

}

