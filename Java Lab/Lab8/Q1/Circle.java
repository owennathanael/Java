public class Circle extends TwoDShape
{
    String circleName;
    String circleColour;
    double radius;
    public Circle(String name,String colour,double radius)
    {
        super(name,colour);
        this.circleName = name;
        this.circleColour = colour;
        this.radius = radius;
    }
    public double area()
    {
        return Math.PI*Math.pow(radius,2);
    }
    
}