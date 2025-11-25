public class Student extends Person
{
    private String course;

    public Student(String name, String course)
    {
        super(name);
        this.course = course;
    }

    @Override
    public String getDescription() {
        return "A student studying " + course;
    }
}