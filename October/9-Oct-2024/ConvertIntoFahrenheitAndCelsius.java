/*
write Java Program Convert Fahrenheit To Celsius | Vice Versa
 Formula-
 Celsius=(Fahrenheit-32)*5/9;
 Fahrenheit=((9*Celsius)/5)+32;
 Note [ Write two seprate program for converting celsius into Fahrenheit and Fahrenheit into celsius ]
*/

package com.classes;

public class ConvertIntoFahrenheitAndCelsius
{
    public static void main(String args[])
    {
        double Celsius = Double.parseDouble(args[0]);
        double Fahrenheit = Double.parseDouble(args[1]);

        double to_Celsius = (Fahrenheit-32)*5/9;

        double to_fahrenheit = ((9*Celsius)/5)+32;

        System.out.printf("Temprature in Celsius is %.2f",to_Celsius);
        System.out.println("\nTemprature in Fahrenheit is "+to_fahrenheit);
    }
}

/*
java ConvertIntoFahrenheitAndCelsius.java 26 90
Temprature in Celsius is 32.22
Temprature in Fahrenheit is 78.8
*/