package app.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by Sean Paragas on 10/22/2017.
 */
public class SevenService
{

    private DBConnection connection;

    public SevenService()
    {
        connection = new DBConnection();
        connection.getConnection();
    }

    //Query 5 = Most Borrowed Book Per Branch
    public ArrayList<String> getQuery()
    {
        ArrayList<String> books = new ArrayList<String>();

        try {
            String query =  "SELECT bl1.BranchID, lb.BranchName, bl1.BookID, NoTimesLoaned, Title, CONCAT(ba.AuthorLastName, \" \", ba.AuthorFirstName) " +
                                "AS Author, b.PublisherName, Address AS PublisherAddress " +
                            "FROM (SELECT bl1.BranchID, lb.BranchName, bl1.BookID, Title, CONCAT(ba.AuthorLastName, \" \", ba.AuthorFirstName) AS Author, " +
                                        "COUNT(*) AS NoTimesLoaned, b.PublisherName, Address " +
                                        "FROM book_loans bl1, book b, book_authors ba, publisher p, library_branch lb " +
                                        "WHERE bl1.bookID = b.bookID AND bl1.BookID = ba.BookID AND b.PublisherName = p.PublisherName " +
                                            "AND \tbl1.BranchID = lb.BranchID " +
                                        "GROUP BY 1, 2, 3, 4, 5, 7, 8) AS tbl " +
                            "WHERE EXISTS (SELECT bl2.BranchID, MAXLOAN " +
                                            "FROM (SELECT bl2.BranchID, MAX(LoanCnt2) AS MAXLOAN " +
                                                    "FROM (SELECT bl2.BranchID, bl2.BookID, COUNT(*) AS LoanCnt2 " +
                                                            "FROM book_loans bl2 " +
                                                            "GROUP BY 1, 2) " +
                                                    "GROUP BY 1) " +
                                            "WHERE bl1.BranchID AND NoTimesLoaned = MAXLOAN) " +
                            "ORDER BY 2, 5;";
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
        return "" + rs.getString("BranchID") + "\t" + rs.getString("BranchName")
                + "\t" + rs.getString("BookID") + "\t" + rs.getString("NoTimesLoaned")
                + "\t" + rs.getString("Title") + "\t" + rs.getString("Author")
                + "\t" + rs.getString("PublisherName") + "\t" + rs.getString("PublisherAddress");
    }
}
