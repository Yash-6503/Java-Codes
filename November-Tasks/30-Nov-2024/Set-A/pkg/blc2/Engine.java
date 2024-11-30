//BLC class of CarEngine -> Engine.java

package pkg.blc2;

public class Engine
{
    String type;

    public Engine(String type)
    {
        this.type = type;
    }

    public void startEngine(){
        System.out.println("Engine of type " + type + " is starting...");
    }   
}