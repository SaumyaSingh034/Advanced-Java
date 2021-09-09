package test;

public class StatementTest
{
public static void main(String[] args)
{
//load Driver
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

//get connection
Connection con = DriverManager.getConnection("jdbc:odbc:datasource","username","password");

//create Statement
Statement st = con.CreateStatement("");
/*st.execute(DDl)  //result will be boolean
int i = st.executeUpdate(DML)  // return how many rows are affected
Resultset  rs = st.executeQuery(DRL);
*/
//create table
String ddl = "Create table student(id number, name varchar2(50), email varchar2(50)");
st.execute(ddl);
System.out.println("table created successfully");
}
}