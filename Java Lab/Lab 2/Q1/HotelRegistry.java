public class HotelRegistry 
{
    public static void main(String args[])
        {
            HotelRoom roomA = new HotelRoom();
            HotelRoom roomB = new HotelRoom();
            roomA.setNumber(200);
            roomA.setTye("Single");
            roomB.setNumber(201);
            roomB.setTye("Double");
            System.out.println("Room A (room number is: "+roomA.getNumber()+" ,"+"type is: "+roomA.getType()+")");
            System.out.println("Room B (room number is: "+roomB.getNumber()+" ,"+"type is: "+roomB.getType()+")");

        }
}