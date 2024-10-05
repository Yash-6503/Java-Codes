/*
Write a program in java to Fahrenheit to Celsius Program
Formula is :-  celsius=((fahrenheit-32)*5)/9;
*/

public class FahrenheitToCelsius
{
    public static void main(String args[])
    {
        float fahrenheit = Float.parseFloat(args[0]);

        float celsius = ((fahrenheit-32)*5)/9.2f;

        System.out.println("Temprature in Celsius is "+celsius);
    }
}

/*
ct-2024> java FahrenheitToCelsius 80

Temprature in Celsius is 26.666666
*/