//BLC class of ZooSimulation -> Animal.java

package pkg.blc1;

public class Animal 
{
    String species;

    public Animal(String species)
    {
        this.species = species;
    }

    public String getSpecies(){
        return species;
    }

    public void makeSound()
    {
        System.out.println("Generic animal sound");
    }

    public String toString(){
        return "Animal [Species = "+species+"]";
    }

    public Animal reproduce()
    {
        System.out.println("Generic reproduction method for all animals.");
        return new Animal("Unknown");
    }
}