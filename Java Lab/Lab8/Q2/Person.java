public abstract class Person 
{
    String name;

    public String getName()
    {
        return name;
    }
    public Person(String name)
    {
        this.name=name;
    }
    public abstract String getDescription();
     
}