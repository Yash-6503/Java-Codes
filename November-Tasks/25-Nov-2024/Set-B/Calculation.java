//Program based on basic and advanced calculations using inheritance

package com.classes;

class CalculationBase
{
    int num1;
    int num2;

    public CalculationBase(int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void performCalculation()
    {
       if(num1 > 0 && num2 > 0)
       {
            System.out.println("Result : "+num1+" + "+num2+" = "+(num1+num2));
       }else if(num1 > 0 && num2 <= 0) {
            System.out.println("Invalid Input Number : "+num2);
       }else if(num2 > 0 && num1 <= 0) {
            System.out.println("Invalid Input Number : "+num1);
       }else {
            System.out.println("Invalid Input Numbers : "+num1+" and "+num2);
       }
    }
}

class AdvancedCalculation extends CalculationBase
{
    double additionalNum;
    String operation;

    public AdvancedCalculation(int num1, int num2, double additionalNum, String operation)
    {
        super(num1,num2);
        this.additionalNum = additionalNum;
        this.operation = operation;
    }

    public void performAdvancedCalculation()
    {
        double total;
        if(additionalNum > 0 && num1 > 0 && num2 > 0){

            switch(operation)
            {
                case "add":
                    total = num1 + num2 + additionalNum;
                    System.out.println("Advanced Calculation of Addition is \n"+num1+" + "+num2+" + "+additionalNum+" = "+total);
                    break;

                case "sub":
                    total = num1 - num2 - additionalNum;
                    System.out.println("Advanced Calculation of Substraction is \n"+num1+" - "+num2+" - "+additionalNum+" = "+total);
                    break;

                case "mul":
                    total = num1 * num2 * additionalNum;
                    System.out.println("Advanced Calculation of Multiplication is \n"+num1+" * "+num2+" * "+additionalNum+" = "+total);
                    break;

                case "div":
                    total = num1 / num2 / additionalNum;
                    System.out.println("Advanced Calculation of Division is \n"+num1+" / "+num2+" / "+additionalNum+" = "+total);
                    break;

                default :
                    System.out.println("Invalid Operation");
            }
        }else if(additionalNum <= 0 && num1 > 0 && num2 > 0){
            System.out.println("Invalid Additional Number : "+additionalNum);
        }else if(num1 <= 0 && num2 > 0 && additionalNum > 0){
            System.out.println("Invalid Number 1 : "+num1);
        }else if(num2 <= 0 && num1 > 0 && additionalNum > 0){
            System.out.println("Invalid Number 2 : "+num2);
        }else if(additionalNum <= 0 && num1 <= 0 && num2 > 0){
            System.out.println("Invalid Additional Number : "+additionalNum+" and Number 1 : "+num1);
        }else if(additionalNum <= 0 && num2 <= 0 && num1 > 0){
            System.out.println("Invalid Additional Number : "+additionalNum+" and Number 2 : "+num2);
        }else if(num1 <= 0 && num2 <= 0 && additionalNum > 0){
            System.out.println("Invalid Number 1 : "+num1+" and Number 2 : "+num2);
        }else{
            System.out.println("Invalid Input Numbers : "+num1+" and "+num2+" and Additional Number : "+additionalNum);
        }
    }    
}

public class Calculation
{
    public static void main(String args[])
    {
        CalculationBase cb = new CalculationBase(10,20);
        cb.performCalculation();

        AdvancedCalculation ac = new AdvancedCalculation(10,20,30,"add");
        ac.performAdvancedCalculation();
    }
}

/*  Tested with Positive Values
Result : 10 + 20 = 30
Advanced Calculation of Addition is 
10 + 20 + 30.0 = 60.0
*/

/*  Tested with Negative Values
Result : 10 + 20 = 30
Invalid Additional Number : -30.0 and Number 2 : -20
*/