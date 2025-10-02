public class recTest3
{
    public static void main(String[] args) 
    {
        rectangle3 rectangle= new rectangle3();   //create rectangle object
        rectangle.setLenght(5);
        rectangle.setiWidth(4);
        System.out.println(rectangle.toString());
        System.out.println(rectangle.printRectangle());
    }
}