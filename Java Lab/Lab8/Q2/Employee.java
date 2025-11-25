public class Employee extends Person
{
float salary;

public Employee(String name,float salary)
{
    super(name);
    this.salary = salary;
}
public String getDescription()
{
    return "An employee with a salary off "+salary;
}
}