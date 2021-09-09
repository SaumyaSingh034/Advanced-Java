import java.util.*;
import java.sql.*;
class LoadDriver3
{
public static void main(String[] args)
{
Enumeration e = DriverManager.getDrivers();
while(e.hasMoreElements())
{
Driver d = (Driver)e.nextElement();
System.out.println(d.getClass().getName());
}
}
}