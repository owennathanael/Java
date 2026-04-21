public class Cylinder extends ThreeDShape
{
    String cylinderName;
    String cylinderColour;
    double radius;
    double height;
    Cylinder(String name, String colour, double radius, double height)
    {
        super(name, colour);
        this.cylinderName = name;
        this.cylinderColour = colour;
        this.radius = radius;
        this.height = height;
    }
    public double volume()
    {
        return Math.PI * Math.pow(radius,2) * height;
    }
    public double area()
    {
        return (2 * Math.PI * radius * radius)+(2 * Math.PI * radius * height);
    }
}
