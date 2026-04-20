import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class SeatCRUD
{
    private static final String DATABASE_URL = "jdbc:mysql://localhost/theater";
    private static final String USER = "root";
    private static final String PASS = "OwenKhent098850";
    int i=0;
    Connection connection = null;
    PreparedStatement pstat = null;
    ResultSet resultSet = null;
    public void seatInsert(int seatID)
    {
        try
        {
            connection =
                    DriverManager.getConnection(DATABASE_URL, USER, PASS);
            pstat = connection.prepareStatement
                    ("INSERT INTO seat (seatID,isAvailable) VALUES (?,?)");
            pstat.setString(1, "seatID");
            pstat.setString(2, "isAvailable");
            i=pstat.executeUpdate();
            System.out.println(i+" record inserted");
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                pstat . close () ;
                connection. close () ;
            }
            catch (Exception exception){
                exception . printStackTrace () ;
            }
        }
    }
    public void seatDelete(int seatID)
    {
        try {
            connection =
                    DriverManager.getConnection(DATABASE_URL, USER, PASS);
            pstat = connection.prepareStatement
                    ("DELETE FROM seat WHERE seatID=?");

            pstat.setInt(1, seatID);
            pstat.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();

        }
        finally
        {
            try
            {
                pstat . close () ;
                connection. close () ;
            }
            catch (Exception exception){
                exception . printStackTrace () ;
            }
        }
    }
   public void seatUpdateAvailability(int seatID, int isAvailable)
    {
        try
        {
            connection = DriverManager.getConnection(DATABASE_URL, USER, PASS);

            pstat = connection.prepareStatement
            ("UPDATE seat SET isAvailable = ? WHERE seatID = ?");
            pstat.setInt(1, seatID);
            pstat.setInt(2, isAvailable);

            pstat.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                pstat . close () ;
                connection. close () ;
            }
            catch (Exception exception){
                exception . printStackTrace () ;
            }
        }
    }
    public String seatRetrieve(int seatID)
    {
        try
        {
            connection =
                    DriverManager.getConnection(DATABASE_URL, USER, PASS);
            pstat = connection.prepareStatement
                    ("SELECT * FROM seat WHERE seatID = ?");
            resultSet=pstat.executeQuery();
            ResultSetMetaData metaData = resultSet.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            System.out.println("Seat table:\n");
            for(int i=1;i<=numberOfColumns;i++)
            {
                System.out.println(metaData.getColumnName(i));
                System.out.println();
            }
            while( resultSet .next() ){
                for ( int i = 1; i <= numberOfColumns; i++ )
                    System.out. print ( resultSet .getObject( i ) + "\t\t");
                System.out. println () ;
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                pstat . close () ;
                connection. close () ;
            }
            catch (Exception exception){
                exception . printStackTrace () ;
            }
        }
        return null;
    }
}
