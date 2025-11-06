package Q1;

public class Animal 
{
    int age;
    String type;
    char gender;
    
    public Animal(String type, int age,char gender)
    {
        
    }
    public void eat()
    {
        System.out.println("animal is eating");
    }
    public void sleep()
    {
        System.out.println("animal is sleeping");
    }
    public void makeSound()
    {
        System.out.println("a generic animal sound");
    }
    public String toString()
    {
        return "type: "+type+"\nage: "+age+"\ngender: "+gender;
    }
}