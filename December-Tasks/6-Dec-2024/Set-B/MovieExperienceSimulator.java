/*
Program to simulate the experience of watching a movie in different types of theaters
using co-variance concept.
*/

package com.classes;

class Theater
{
    String theaterName;
    Boolean is3DEnabled;

    public Theater(String theaterName, Boolean is3DEnabled)
    {
        this.theaterName = theaterName;
        this.is3DEnabled = is3DEnabled;
    }

    public Theater getTheaterDetails(){
        System.out.println("Theater Name: " + this.theaterName);
        System.out.println("3D Enabled: " + this.is3DEnabled);
        return new Theater(theaterName,is3DEnabled);
    }
}

class IMAXTheater extends Theater
{
    public IMAXTheater(String theaterName, Boolean is3DEnabled)
    {
        super(theaterName,is3DEnabled);
    }

    @Override 
    public IMAXTheater getTheaterDetails(){
        super.getTheaterDetails();
        System.out.println("Seating Capacity: 100");
        return new IMAXTheater(theaterName,is3DEnabled);
    }
}

class PremiumTheater extends Theater
{
    public PremiumTheater(String theaterName, Boolean is3DEnabled){
        super(theaterName,is3DEnabled);
    }

    @Override
    public PremiumTheater getTheaterDetails(){
        super.getTheaterDetails();
        System.out.println("Ticket Price: 500");
        return new PremiumTheater(theaterName,is3DEnabled);
    }
}

class RegularTheater extends Theater
{
    public RegularTheater(String theaterName, Boolean is3DEnabled){
        super(theaterName,is3DEnabled);
    }

    @Override
    public RegularTheater getTheaterDetails(){
        super.getTheaterDetails();
        System.out.println("Good Sound System");
        return new RegularTheater(theaterName,is3DEnabled);
    }
}

public class MovieExperienceSimulator
{
    public static void main(String args[])
    {
        Theater t = new Theater("Generic Theater",true);
        t.getTheaterDetails();

        System.out.println("");
        IMAXTheater i = new IMAXTheater("IMAX Theater",true);
        i.getTheaterDetails();

        System.out.println("");
        PremiumTheater p = new PremiumTheater("Premium Theater",true);
        p.getTheaterDetails();

        System.out.println("");
        RegularTheater r = new RegularTheater("Regular Theater",true);
        r.getTheaterDetails();
        
    }
}

/*
Theater Name: Generic Theater
3D Enabled: true

Theater Name: IMAX Theater
3D Enabled: true
Seating Capacity: 100

Theater Name: Premium Theater
3D Enabled: true
Ticket Price: 500

Theater Name: Regular Theater
3D Enabled: true
Good Sound System
*/