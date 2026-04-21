// Name:Owen Nathanael
// Student Number:c00313648
// Lab:2b
public class rectangle2
{
    private double width;
    private double lenght;

    public String toString()
    {
        return "Lenght: "+lenght+", Width: "+width+", Area:"+getArea()+", Perimeter:"+getPerimiter();
    }
    //Setter
    public void setiWidth(double recWidth)
    {
        if(recWidth>0&&recWidth<40.0)
        {
        width=recWidth;
        }
        else
        {
            System.out.println("error");
        }
    }
    public void setLenght(double recLenght)
    {
        if(recLenght>0&&recLenght<40.0)
        {
        lenght=recLenght;
        }
        else
        {
            System.out.println("error");
        }
    }
    //Getter
    public double getWidth()
    {
        return width;
    }
    public double getLenght()
    {
        return lenght;
    }
    public double getArea()
    {
        return (width*lenght);
    }
    public double getPerimiter()
    {
        return ((2*width)+(2*lenght));
    }
}