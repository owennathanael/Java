package Q1;

public class Dog extends Animal
{
    String dogType;
    int dogAge;
    char dogGender;
    public Dog (String type,int age, char gender)
    {
        super(type,age,gender);        
        dogType=type;
        dogAge=age;
        dogGender=gender;
    }
    public void eat()
    {
        System.out.println("dog is eating");
    }
    public void sleep()
    {
        System.out.println("dog is sleeping");
    }
    public void makeSound()
    {
        System.out.println("a generic dog sound");
    }
    public String toString()
    {
        return "type: "+dogType+"\nage: "+dogAge+"\ngender: "+dogGender;
    }
}