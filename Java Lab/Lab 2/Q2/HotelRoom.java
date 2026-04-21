public class HotelRoom 
{
    private int roomNumber;
    private String roomType;
    private int vacancy;
    private double rate;
    public void setTye(String type)
    {
        roomType=type;
    }
    public void setNumber(int number)
    {
        roomNumber=number;
    }
    public void setVacancy(int vacant)
    {
        vacancy=vacant;
    }
    public void setRate(double roomRate)
    {
        rate=roomRate;
    }
    public String getType()
    {
        return roomType;
    }
    public int getNumber()
    {
        return roomNumber;
    }
    public int getVacancy()
    {
        return vacancy;
    }
    public double getRate()
    {
        return rate;
    }
    
}

