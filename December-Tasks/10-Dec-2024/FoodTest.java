/*Program to create an abstract class Food with abstract method getMacroNutrients() and a concrete 
class Egg and Bread which extends Food class.
*/

package com.classes;

import java.util.*;

abstract class Food
{
    double proteins;
    double fats;
    double carbs;
    double tastyScore;
    public abstract void getMacroNutrients();

    public Food(double proteins, double fats, double carbs)
    {
        this.proteins = proteins;
        this.fats = fats;
        this.carbs = carbs;
    }
}

class Egg extends Food
{
    public Egg(double proteins, double fats, double crabs)
    {
       super(proteins, fats, crabs);
    }

    int tastyScore = 7;
    String type = "non-vegetarian";

    @Override
    public void getMacroNutrients()
    {
        System.out.println("An egg has "+super.proteins+"gms of protein, "+super.fats+"gms of fats and "+super.carbs+"gms of carbohydrates.");
    }

}

class Bread extends Food
{
    public Bread(double proteins, double fats, double crabs)
    {
        super(proteins, fats, crabs);
    }

    int tastyScore = 8;
    String type = "vegetarian";

    @Override
    public void getMacroNutrients()
    {
        System.out.println("A slice of bread has "+this.proteins+"gms of protein, "+this.fats+"gms of fats and "+this.carbs+"gms of carbohydrates.");
    }
}

public class FoodTest
{
    public static void main(String args[])
    {
        int n, numberOfFoodItems;
        Scanner sc = new Scanner(System.in);

        System.out.println("Food Menu");
        System.out.println("Egg");
        System.out.println("Bread");
        System.out.println("Exit");
        System.out.println("Enter your Choice: ");
        String choice = sc.nextLine();
      
        if(choice.equals("egg") || choice.equals("Egg") || choice.equals("EGG")) {
        	Egg egg = new Egg(6.2, 5.1, 0);
            System.out.println("Egg is "+egg.type);
            egg.getMacroNutrients();
            System.out.println("Taste: "+egg.tastyScore);
        }else if(choice.equals("bread") || choice.equals("Bread") || choice.equals("BREAD")) {
        	Bread bread = new Bread(4.0,1.1,13.8);
        	System.out.println("Bread is "+bread.type);
            bread.getMacroNutrients();
            System.out.println("Taste: "+bread.tastyScore);
        }else if(choice.equals("Exit") || choice.equals("exit") || choice.equals("EXIT")) {
        	System.exit(0);
        }else {
        	System.out.println("Invalid choice");
        }

    }
}


/*
Food Menu
Egg
Bread
Exit
Enter your Choice: 
BREAD
Bread is vegetarian
A slice of bread has 4.0gms of protein, 1.1gms of fats and 13.8gms of carbohydrates.
Taste: 8
*/

/*
Food Menu
Egg
Bread
Exit
Enter your Choice: 
EGG
Egg is non-vegetarian
An egg has 6.2gms of protein, 5.1gms of fats and 0.0gms of carbohydrates.
Taste: 7
*/