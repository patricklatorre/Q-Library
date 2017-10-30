package app.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by Sean Paragas on 10/22/2017.
 */
public class SixService
{

    private DBConnection connection;

    public SixService()
    {
        connection = new DBConnection();
        connection.getConnection();
    }

    //Query 6 = NEVER Loaned in a branch
    public ArrayList<String> getQuery(String branch)
    {
        ArrayList<String> books = new ArrayList<String>();

        try {
            String query =  "SELECT Title " +
                            "FROM book " +
                            "WHERE BookID NOT IN (SELECT DISTINCT BookID " +
                                            "FROM book_loans bl, library_branch lb " +
                                            "WHERE bl.branchID = lb.branchID AND lb.BranchName = '" + branch + "'";
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
        return "" + rs.getString("Title");
    }
}
