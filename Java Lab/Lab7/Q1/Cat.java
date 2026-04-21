package Q1;

public class Cat extends Animal
{
    String catType;
    int catAge;
    char catGender;
    public Cat (String type,int age, char gender)
    {
        super(type, age, gender);
        catType=type;
        catAge=age;
        catGender=gender;
    }
    public void eat()
    {
        System.out.println("cat is eating");
    }
    public void sleep()
    {
        System.out.println("cat is sleeping");
    }
    public void makeSound()
    {
        System.out.println("a generic cat sound");
    }
    public String toString()
    {
        return "type: "+catType+"\nage: "+catAge+"\ngender: "+catGender;
    }
}