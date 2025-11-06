// Author : Owen Nathanael
// Date : october-2025
// Purpose : A test driver program for our: Point/Circle inheritance
package Q1;
class Point
{
    int x;
    int y;
    
    public Point(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    //setter and getter
    public void setX(int xCord)
    {
        x=xCord;
    }
    public void setY(int yCord)
    {
        y=yCord;
    }
    @Override
    public String toString() 
    {
        return "\nx coordinate: "+x+"\ny coordinate: "+y;
    }
}
class Circle extends Point
{
    int radius;
    
    public Circle(int x, int y, int radius)
    {
        super(x , y);
        this.radius=radius;
    }
    public void setRadius(int radCord)
    {
        radius=radCord;
    }
    public String toString() 
    {
        return "\nx coordinate: "+x+"\ny coordinate: "+y+"\nRadius: "+radius;
    }
}