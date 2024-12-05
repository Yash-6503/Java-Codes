//BLC class of ZooSimulation -> Mammal.java

package pkg.blc1;

public class Mammal extends Animal
{
    boolean hasFur;

    public Mammal(String species, boolean hasFur)
    {
        super(species);
        this.hasFur = hasFur;
    }

    @Override
    public void makeSound(){
        System.out.println("Mammals sound");
    }

    @Override 
    public String toString(){
        return "Mammal [species = "+species+", hasFur = "+hasFur+"]";
    }

    @Override
    public Mammal reproduce()
    {
        System.out.println("Mammals give birth to live young.");
        return new Mammal(species,hasFur);
    }

    public void nurseYoung(){
        System.out.println("Mammals nursing their young.");
    }
}