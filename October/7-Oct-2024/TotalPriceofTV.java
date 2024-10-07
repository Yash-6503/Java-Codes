/*
A shopkeeper buys a TV set for Rs. 32,500 and sells it at a profit of 27%. 
Apart from this a VAT of 12.7% and Service Charge is 3.87% is charged. 
Display total selling price, profit along with vat and service charge.
*/

package com.classes;

public class TotalPriceofTV
{
    public static void main(String args[])
    {
        int buying_price = 32500;
        int selling_price = (buying_price / 100)*27 + buying_price; //8775+32500 = 41275

        double VAT_on_selling = (selling_price/100)*12.7;   //5241.925

        double service_charge = (selling_price/100)*3.87;   //1597.342

        double Total_Price = selling_price + VAT_on_selling + service_charge;

        System.out.println("Total selling price is Rs."+Total_Price);
        System.out.println("Profit Rs."+selling_price+" VAT charge Rs."+VAT_on_selling+" Service charge Rs."+service_charge);
    }
}

/*
Total selling price is Rs.48101.840000000004
Profit Rs.41275 VAT charge Rs.5232.4 Service charge Rs.1594.44
*/