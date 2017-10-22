package app.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by Sean Paragas on 10/22/2017.
 */
public class ThreeService
{

    private DBConnection connection;

    public ThreeService()
    {
        connection = new DBConnection();
        connection.getConnection();
    }

    //Query 3 = books by Author (Last Name)
    public ArrayList<String> getQuery(String name)
    {
        ArrayList<String> books = new ArrayList<String>();

        try {
            String query =  "SELECT bk.Title, bk.PublisherName, CONCAT(ba.AuthorFirstName, \" \", ba.AuthorLastName) AS Author" +
                            " FROM book bk, book_authors ba" +
                            " WHERE bk.BookID = ba.BookID AND " +
                                "ba.AuthorLastName IN (SELECT AuthorLastName " +
                                                    "FROM book_authors " +
                                                    "WHERE AuthorLastName = '" + name + "')" +
                            " ORDER BY bk.Title ASC;";
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
        return "" + rs.getString("Title") + "\t" + rs.getString("PublisherName") +
                "\t" + rs.getString("Author");
    }
}
