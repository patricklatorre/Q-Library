package app.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by Sean Paragas on 10/22/2017.
 */
public class TwoService
{

    private DBConnection connection;

    public TwoService()
    {
        connection = new DBConnection();
        connection.getConnection();
    }

    //Query 2 = borrowed books from set range of books
    public ArrayList<String> getQuery(String start, String end)
    {
        ArrayList<String> books = new ArrayList<String>();

        try {
            String query =  "SELECT BranchID, BookID, DateOut, DueDate" +
                            " FROM book_loans" +
                            " WHERE DateOut BETWEEN '" + start + "' AND '" + end + "' " +
                            " ORDER BY 1 ASC, 2 ASC, 3 ASC;";
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
        return "" + rs.getString("BranchID") + "\t" + rs.getString("BookID")
                + "\t" + rs.getString("DateOut") + "\t" + rs.getString("DueDate");
    }
}
