/*
Write a  program in Java that will generate and print the bill at Dominos for four chicken rolls (@ Rs 60 per chicken rolls) and three vegetable puffs (@ Rs 25 per vegetable puffs). There is a special discount of Rs 50 on the final bill amount. Calculate and print final bill as well as all item bill.
*/

public class GenerateBill
{
    public static void main(String args[])
    {
        int Chicken_rolls = 4;
        int rate_ofChicken_rolls = 60;
        int vegetable_puffs = 3;
        int rate_veg_puffs = 25;
        int discount = 50;

        int FinalBill;

        FinalBill = (Chicken_rolls * rate_ofChicken_rolls) + (vegetable_puffs * rate_veg_puffs) - discount;

        System.out.println("Final Bill is "+FinalBill);

        System.out.println("Bill of Chicken Rolls is "+(Chicken_rolls*rate_ofChicken_rolls));

        System.out.println("Bill of Vegetable puffs is "+(vegetable_puffs*rate_veg_puffs));
    }
}

/*
Final Bill is 265
Bill of Chicken Rolls is 240
Bill of Vegetable puffs is 75 
*/