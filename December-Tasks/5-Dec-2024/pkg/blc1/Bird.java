//BLC class of ZooSimulation -> Bird.java

package pkg.blc1;

public class Bird extends Animal
{
    boolean canFly;

    public Bird(String species, boolean canFly)
    {
        super(species);
        this.canFly = canFly;
    }

    @Override
    public void makeSound(){
        System.out.println("Birds sound");
    }

    @Override 
    public String toString(){
        return "Bird [species = "+species+", canFly = "+canFly+"]";
    }

    @Override
    public Bird reproduce()
    {
        System.out.println("Birds lay eggs as a means of reproduction.");
        return new Bird(species,canFly);
    }

    public void buildNest(){
        System.out.println("Birds building nests for their eggs.");
    }
}