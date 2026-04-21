public class Rectangle extends TwoDShape
{
    String rectangleName;
    String rectangleColour;
    double width;
    double length;
    public Rectangle(String name, String colour,double width,double length)
    {
        super(name,colour);
        this.rectangleName = name;
        this.rectangleColour = colour;
        this.width = width;
        this.length = length;
    }
    public double area()
    {
        return width*length;
    }
}
