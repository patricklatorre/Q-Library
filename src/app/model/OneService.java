package app.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by Sean Paragas on 10/22/2017.
 */
public class OneService
{

    private DBConnection connection;

    public OneService()
    {
        connection = new DBConnection();
        connection.getConnection();
    }

    //Query 1 = get books by publisher
    public ArrayList<String> getQuery(String publisher)
    {
        ArrayList<String> books = new ArrayList<String>();

        try {
            String query =  "SELECT Title, PublisherName " +
                            "FROM book " +
                            "WHERE PublisherName = '" + publisher +
                            "' ORDER BY 1;";
            Statement statement = connection.getConnection().createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                books.add(toBooks(rs));
            }
            return books;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private String toBooks(ResultSet rs) throws SQLException
    {
        return "" + rs.getString("Title") + "\t" + rs.getString("PublisherName");
    }
}
