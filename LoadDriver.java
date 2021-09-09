import java.util.*;
import java.sql.*;
public class LoadDriver
        {
		    public static void main(String[] args)
			{
			   // Using Class.Forname
			   try
			   {
			        Class.forName("sun.jdbc.odbc.JdbcOdbcDrivers");        //Exception Class Not Found
				}catch(ClassNotFoundException cnfe)
				    {
					cnfe.printStackTrace();
					}
				
					Enumeration e = DriverManager.getDrivers( );
					
					while(e.hasMoreElements())   //Return Boolean
					{
					Driver d = (Driver)e.nextElement();
					System.out.println(d.getClass().getName());
					}
				}
		}
