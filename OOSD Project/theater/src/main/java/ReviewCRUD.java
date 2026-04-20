import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ReviewCRUD
{
    private static final String DATABASE_URL = "jdbc:mysql://localhost/theater";
    private static final String USER = "root";
    private static final String PASS = "OwenKhent098850";
    int i=0;
    Connection connection = null;
    PreparedStatement pstat = null;
    ResultSet resultSet = null;
    public void reviewInsert(int userID, int movieID, int rating, String comment)
    {
        try
        {
            connection =
                    DriverManager.getConnection(DATABASE_URL, USER, PASS);
            pstat = connection.prepareStatement
                    ("INSERT INTO review (userID, movieID, rating, comment, reviewDate) VALUES (?,?,?,?, NOW())");
            pstat.setInt(1, userID);
            pstat.setInt(2, movieID);
            pstat.setInt(3, rating);
            pstat.setString(4, comment);
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
    public void reviewDelete(int reviewID)
    {
        try {
            connection =
                    DriverManager.getConnection(DATABASE_URL, USER, PASS);
            pstat = connection.prepareStatement
                    ("DELETE FROM review WHERE reviewID=?");

            pstat.setInt(1, reviewID);
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
    public void reviewUpdateRating(int reviewID,int rating)
    {
        try
        {
            connection =
                    DriverManager.getConnection(DATABASE_URL, USER, PASS);
            pstat = connection.prepareStatement("UPDATE review SET rating = ? WHERE reviewID = ?");
            pstat . setInt(1, rating);
            pstat.setInt(2, reviewID);
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
     public void reviewUpdateComment(int reviewID, String comment)
    {
        try
        {
            connection =
                    DriverManager.getConnection(DATABASE_URL, USER, PASS);
            pstat = connection.prepareStatement("UPDATE review SET comment = ? WHERE reviewID = ?");
            pstat . setString(1, comment);
            pstat.setInt(2, reviewID);
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
    public String reviewRetrieve(int reviewID)
    {
        try
        {
            connection =
                    DriverManager.getConnection(DATABASE_URL, USER, PASS);
            pstat = connection.prepareStatement
                    ("SELECT * FROM review WHERE reviewID = ?");
            resultSet=pstat.executeQuery();
            ResultSetMetaData metaData = resultSet.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            System.out.println("Reviews table:\n");
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
    
    public java.util.List<String> getReviewsForMovie(int movieID) {
        java.util.List<String> reviews = new java.util.ArrayList<>();
        try {
            connection = DriverManager.getConnection(DATABASE_URL, USER, PASS);
            pstat = connection.prepareStatement(
                "SELECT review.rating, review.comment, review.reviewDate, users.userName FROM review " +
                "INNER JOIN users ON review.userID = users.userID WHERE review.movieID = ? ORDER BY review.reviewDate DESC");
            pstat.setInt(1, movieID);
            resultSet = pstat.executeQuery();
            while (resultSet.next()) {
                reviews.add("Rating: " + resultSet.getInt("review.rating") + "/5 - " + resultSet.getString("review.comment") + 
                    " (by " + resultSet.getString("users.userName") + " on " + resultSet.getTimestamp("review.reviewDate") + ")");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try { if (pstat != null) pstat.close(); if (connection != null) connection.close(); }
            catch (Exception e) { e.printStackTrace(); }
        }
        return reviews;
    }
}
