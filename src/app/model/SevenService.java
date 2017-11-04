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
            String query =  "SELECT DISTINCT LB.BranchID, LB.BranchName, Table3.BookID, NoTimesLoaned, B.Title, " +
                                "CONCAT(BA.AuthorFirstName, ' ', BA.AuthorLastName) AS Author, P.PublisherName, " +
                                "P.Address AS PublisherAddress " +
                            "FROM book B, library_branch LB, publisher P, " +
                                "book_authors BA, (SELECT MAX(NoOfLoanPerBookPerBranch) AS NoTimesLoaned, Table1.BranchID " +
                                                "FROM (SELECT COUNT(BookID) AS NoOfLoanPerBookPerBranch, BL.BookID, BL.BranchID " +
                                                        "FROM book_loans BL " +
                                                        "GROUP BY BL.BranchID, BL.BookID) Table1 " +
                                                "GROUP BY Table1.BranchID) Table2 " +
                                        "INNER JOIN (SELECT COUNT(BookID) AS Count, BL.BookID, BL.BranchID " +
                                                    "FROM book_loans BL " +
                                                    "GROUP BY BL.BranchID, BL.BookID) Table3 ON NoTimesLoaned = Table3.Count " +
                            "WHERE BA.BookID = Table3.BookID AND B.BookID = Table3.BookID " +
                                "AND B.PublisherName = P.PublisherName AND LB.BranchID = Table2.BranchID " +
                            "GROUP BY 1" +
                            "ORDER BY 1, 5;";
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
