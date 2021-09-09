import java.sql.*;
import sun.jdbc.odbc.*;
import java.util.*;

class LoadDriver2
{
public static void main(String[] args)
{
Driver driver = new JdbcOdbcDriver();
DriverManager.registerDriver(driver);
Enumeration e = DriverManager.getDrivers();
while(e.hasMoreElements())
{
Driver d = (Driver)e.nextElement();
System.out.println(d.getClass().getName());
}
}
}