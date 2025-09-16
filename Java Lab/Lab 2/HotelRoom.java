public class HotelRoom 
{
    private int roomNumber;
    private String roomType;
    public void setTye(String type)
    {
        roomType=type;
    }
    public void setNumber(int number)
    {
        roomNumber=number;
    }
    public String getType()
    {
        return roomType;
    }
    public int getNumber()
    {
        return roomNumber;
    }
}

