import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserCRUD
{
    private static final String DATABASE_URL = "jdbc:mysql://localhost/theater";
    private static final String USER = "root";
    private static final String PASS = "OwenKhent098850";
    int i=0;
    Connection connection = null;
    PreparedStatement pstat = null;
    ResultSet resultSet = null;
    public void userInsert(int userID, String userName, String email, String password, int loyaltyPoints, boolean notUser)
{
    try
    {
        connection = DriverManager.getConnection(DATABASE_URL, USER, PASS);

        pstat = connection.prepareStatement(
            "INSERT INTO users (userName, email, password) VALUES (?, ?, ?)"
        );
        pstat.setString(1, userName);
        pstat.setString(2, email);
        pstat.setString(3, password);

        int i = pstat.executeUpdate();
        System.out.println(i + " record inserted");
    }
    catch (SQLException e)
    {
        e.printStackTrace();
    }
    finally
    {
        try
        {
            if (pstat != null) pstat.close();
            if (connection != null) connection.close();
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }
}
    public void userDelete(int userID)
    {
        try {
            connection =
                    DriverManager.getConnection(DATABASE_URL, USER, PASS);
            pstat = connection.prepareStatement
                    ("DELETE FROM users WHERE userID=?");

            pstat.setInt(1, userID);
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
    public void userUpdateName(int userID,String userName)
    {
        try
        {
            connection =
                    DriverManager.getConnection(DATABASE_URL, USER, PASS);
            pstat = connection.prepareStatement("UPDATE users SET userName = ? WHERE userID = ?");
            pstat . setString (1, userName);
            pstat.setInt(2, userID);
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
    public void userUpdateEmail(int userID,String email)
    {
        try
        {
            connection =
                    DriverManager.getConnection(DATABASE_URL, USER, PASS);
            pstat = connection.prepareStatement("UPDATE users SET email = ? WHERE userID = ?");
            pstat . setString (1, email);
            pstat.setInt(2, userID);
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
    public void userUpdatePassword(int userID,String password)
    {
        try
        {
            connection =
                    DriverManager.getConnection(DATABASE_URL, USER, PASS);
            pstat = connection.prepareStatement("UPDATE users SET password = ? WHERE userID = ?");
            pstat . setString (1, password);
            pstat.setInt(2, userID);
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
    public void userUpdateLoyaltyPoints (int userID,int loyaltyPoints)
    {
        try
        {
            connection =
                    DriverManager.getConnection(DATABASE_URL, USER, PASS);
            pstat = connection.prepareStatement("UPDATE users SET loyaltyPoints = ? WHERE userID = ?");
            pstat . setInt (1, loyaltyPoints);
            pstat.setInt(2, userID);
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
    public void userUpdateStatus(int userID,int notUser)
    {
        try
        {
            connection =
                    DriverManager.getConnection(DATABASE_URL, USER, PASS);
            pstat = connection.prepareStatement("UPDATE users SET notUser = ? WHERE userID = ?");
            pstat . setInt (1, notUser);
            pstat.setInt(2, userID);
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
    public String userRetrieve(int userID)
    {
        try
        {
            connection =
                    DriverManager.getConnection(DATABASE_URL, USER, PASS);
            pstat = connection.prepareStatement
                    ("SELECT * FROM users WHERE userID = ?");
            resultSet=pstat.executeQuery();
            ResultSetMetaData metaData = resultSet.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            System.out.println("User table:\n");
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
