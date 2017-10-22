package app.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Sean Paragas on 10/21/2017.
 */
public class DBConnection
{

    private String url;
    private String db;
    private String uName;
    private String password;
    private Connection c;

    public DBConnection()
    {
        setURL("jdbc:mysql://localhost:3306/");
        setDBName("library");
        setUsername("root");
        setPassword("grounded");
    }

    public Connection getConnection()
    {
        try	{
            c = DriverManager.getConnection(getURL() + getDBName() + "?useSSL=false", getUsername(), getPassword());
            System.out.println("Successfully connected to " + getDBName() + " database.");
            return c;
        } catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }


    public String getURL() {
        return url;
    }

    public void setURL(String url) {
        this.url = url;
    }

    public String getDBName() {
        return db;
    }

    public void setDBName(String db) {
        this.db = db;
    }

    public String getUsername() {
        return uName;
    }

    public void setUsername(String uName) {
        this.uName = uName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
