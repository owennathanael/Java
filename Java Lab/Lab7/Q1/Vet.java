package Q1;

public class Vet
{
    String names;

    public Vet(String names)
    {
        this.names=names;
    }
    public void vaccinate(Animal animal)
    {
        System.out.println("\n"+names+" is vacinating");
        if (animal instanceof Dog)
        {
            System.out.println("Dog has been vaccinated: ");
            System.out.println(animal);
        }
        else if (animal instanceof Cat)
        {
            System.out.println("Cat has been vaccinated: ");
            System.out.println(animal);
        }
    }
}