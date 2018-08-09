/*
 * a-sti.ro
 */
package javadatabaseconnection;

import java.sql.*;
/**
 *
 * @author gheorgheaurelpacurar
 */
public class JDBCExample {
    public static void main (String[] args)
    {
        // Try to create a connection and test if the user exists
        String user = "test";
        String password = "test";
        String url = "jdbc:derby://localhost:1527/ebooksstore;create=true";
        String driver = "org.apache.derby.jdbc.ClientDriver";
        // set connection paramters to the DB
        ResultSet resultSet = null;
        Statement statement = null;
        Connection connection = null;
        try
        {
            Class driverClass = Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT NAME, PASSWORD, ROLE FROM TEST.USERS");
            boolean resultSetHasRows = resultSet.next(); 
            if (resultSetHasRows)
            {
                System.out.println("User Exists in Database");
            }
            else
            {
                System.out.println("User Not Find in Database");
            }
        }
        catch (ClassNotFoundException | SQLException ex)
        {
            System.out.println(ex);
        }
        finally
        {
            if (resultSet != null)
            {
                try
                {
                    resultSet.close();
                }
                catch (SQLException ex){System.out.println(ex);}
            }
            if (statement != null)
            {
                try
                {
                    statement.close();
                }
                catch (SQLException ex){System.out.println(ex);}
            }	
            if (connection != null)
            {
                try
                {
                    connection.close();
                }
                catch (SQLException ex){System.out.println(ex);}
            }
        }	
    }
}
