package com.classes;

//Write a Program on OOPs to define Fan class properties and behaviour.

class Fan
{
    String name;
    String coil;
    int wings;

    public Fan()
    {
        this.name = name;
        this.coil = coil;
        this.wings = wings;
    }

    public String toString()
    {
        return "Fan [name=" + name + ", coil=" + coil + ", wings=" + wings + "]";
    }

    public void switchOn()
    {
        System.out.println("Fan is On Now.");
    }

    public void switchOff()
    {
        System.out.println("Fan is Off Now.");        
    }
}

public class Example2
{
    public static void main(String args[])
    {
        Fan f = new Fan();
        f.name = "Crompton";
        f.coil = "Copper";
        f.wings = 3;

        System.out.println(f);
        f.switchOn();
        f.switchOff();
    }
}

/*
Fan [name=Crompton, coil=Copper, wings=3]
Fan is On Now.
Fan is Off Now.
*/