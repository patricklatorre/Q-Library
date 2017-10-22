package app.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by Sean Paragas on 10/22/2017.
 */
public class FiveService
{

    private DBConnection connection;

    public FiveService()
    {
        connection = new DBConnection();
        connection.getConnection();
    }

    //Query 5 = Top Borrower
    public ArrayList<String> getQuery()
    {
        ArrayList<String> books = new ArrayList<String>();

        try {
            String query =  "SELECT bl.CardNo, CONCAT(b.BorrowerFName, \" \", b.BorrowerLName) AS Borrower, COUNT(bl.BookID) AS 'NoBkBor' " +
                            "FROM book_loans bl, borrower b, (SELECT CardNo, COUNT(BookID) AS 'cnt' FROM book_loans GROUP BY CardNo) a " +
                            "WHERE bl.CardNo = b.CardNo AND b.CardNo = a.CardNo AND " +
                            "a.cnt >= (SELECT MAX(b.cnt)\tFROM (SELECT CardNo, COUNT(BookID) AS 'cnt' FROM book_loans GROUP BY CardNo) b) " +
                            "GROUP BY bl.CardNo " +
                            "ORDER BY 2 ASC;";
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
        return "" + rs.getString("CardNo") + "\t" + rs.getString("Borrower")
                + "\t" + rs.getString("NoBkBor");
    }
}
