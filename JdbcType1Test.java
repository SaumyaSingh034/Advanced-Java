import java.sql.*;
public class JdbcType1Test
{
public static void main(String[] args)
{
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
}catch(ClassNotFoundException cnf)
{
cnf.printStackTrace();
}
try
{
Connection con = DriverManager.getConnection("jdbc:odbc:saumya_datasource","system","manager");
System.out.println(con);
}
catch(SQLException sql)
{
sql.printStackTrace();
}







}
}