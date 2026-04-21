public class TestPerson {
    public static void main(String[] args)
    {
        Person e = new Employee("Alice", 50000);
        Person s = new Student("Bob", "Computer Science");

        System.out.println(e.getName() + ": " + e.getDescription());
        System.out.println(s.getName() + ": " + s.getDescription());
    }
}