package app.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by Sean Paragas on 10/22/2017.
 */
public class FourService
{

    private DBConnection connection;

    public FourService()
    {
        connection = new DBConnection();
        connection.getConnection();
    }

    //Query 4 = NEVER Loaned
    public ArrayList<String> getQuery()
    {
        ArrayList<String> books = new ArrayList<String>();

        try {
            String query =  "SELECT b.BookID, b.Title, ba.Author, b.PublisherName " +
                            "FROM book b, book_authors ba " +
                            "WHERE b.BookID = ba.BookID " +
                            "AND b.BookID NOT IN (SELECT DISTINCT BookID FROM book_loans) " +
                            "ORDER BY 3 ASC, 2 ASC;";
            Statement statement = connect.getConnection().createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                books.add(toBooks(rs));
            }
            return sellers;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private String toBooks(ResultSet rs) throws SQLException
    {
        return "" + rs.getString("BookID") + "\t" + rs.getString("Title")
                + "\t" + rs.getString("PublisherName") + "\t" + rs.getString("Author");
    }
}
