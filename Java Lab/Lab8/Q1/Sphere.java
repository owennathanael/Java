public class Sphere extends ThreeDShape
{
    String sphereName;
    String sphereColour;
    double radius;
    public Sphere(String name, String colour, double radius)
    {
        super(name, colour);
        this.sphereName= name;
        this.sphereColour = colour;
        this.radius = radius;
    }
    public double area()
    //im guessing this will be surface area for 3d?
    {
        return 4 * Math.PI * radius * radius;
    }
    public double volume()
    {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
