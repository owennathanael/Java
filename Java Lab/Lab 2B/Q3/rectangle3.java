// Name:Owen Nathanael
// Student Number:c00313648
// Lab:2b
public class rectangle3
{
    private double width;
    private double lenght;

    public String toString()
    {
        return "Lenght: "+lenght+", Width: "+width;
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
    public String printRectangle()
    {
        String recShape;
        recShape="";
        for(int indexL=0;indexL<lenght;indexL++)//Make a nested forloop to help find the index location of the *
        //We use L for thestart so we can control the top and the bottom of the shape
        {
                for(int indexW=0;indexW<width;indexW++)
                {
                    if(indexL==0||indexL==lenght-1||indexW==0||indexW==width-1)
                    {
                        recShape=recShape+"* ";
                    }
                    else
                    {
                        recShape+="  ";
                    }
                }
            recShape+="\n";
        }
        return recShape;
    }
}