package app.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by Sean Paragas on 10/22/2017.
 */
public class EightService
{

    private DBConnection connection;

    public EightService()
    {
        connection = new DBConnection();
        connection.getConnection();
    }

    //Query 8 - borrowers of book
    public ArrayList<String> getQuery(String book)
    {
        ArrayList<String> books = new ArrayList<String>();

        try {
            String query =  "SELECT bk.Title, lb.BranchName, CONCAT (b.BorrowerFName,\" \", b.BorrowerLName) " +
                                "AS Borrower, bl.DateOut, bl.DueDate " +
                            "FROM book bk, borrower b, library_branch lb, book_loans bl " +
                            "WHERE bk.BookID = bl.BookID AND b.CardNo = bl.CardNo AND lb.BranchID = bl.BranchID " +
                                "AND bk.Title = '" + book + "'" +
                    "ORDER BY 2 ASC, 3 ASC;";
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
        return "" + rs.getString("Title") + "\t" + rs.getString("BranchName")
                + "\t" + rs.getString("Borrower") + "\t" + rs.getString("DateOut")
                + "\t" + rs.getString("DueDate");
    }
}
