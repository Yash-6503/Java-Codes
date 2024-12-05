//ELC (main) class of Mammal, Bird, Animal classes -> ZooSimulation.java

package pkg.blc1;

public class ZooSimulation
{
    public static void main(String args[])
    {
        System.out.println("Mammal Details");
        Mammal m = new Mammal("Lion",true);
        // System.out.println(m.reproduce());   //using this stmt we can directly print toString & reproduce methods
        System.out.println(m);  
        m.reproduce();
        m.makeSound();
        m.nurseYoung();

        System.out.println("\nBird Details");
        Bird b = new Bird("Parrot",true);
        // System.out.println(b.reproduce());   //using this stmt we can directly print toString & reproduce methods
        System.out.println(b);
        b.reproduce();
        b.makeSound();
        b.buildNest();
    }
}

/*
Mammal Details
Mammal [species = Lion, hasFur = true]
Mammals give birth to live young.
Mammals sound
Mammals nursing their young.

Bird Details
Bird [species = Parrot, canFly = true]
Birds lay eggs as a means of reproduction.
Birds sound
Birds building nests for their eggs.
*/