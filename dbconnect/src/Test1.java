import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.internal.ResultSetCache;
import oracle.jdbc.pool.OracleDataSource;
public class Test1
{  
public static void main(String args[]) throws SQLException
{  
try
{  

//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.93:1521:orcl","admin","orcl");
//Connection con=DriverManager.getConnection("jdbc:sqlserver://192.168.1.93;DatabaseName=CXI_BH_Test01;","sa","pointel@10");

if(con!=null)
	System.out.println("connection succeed");
else
	System.out.println("not succeed");
  
PreparedStatement stmt=con.prepareStatement("select * from testclob");

/*int i=stmt.executeUpdate();
System.out.println(i+"records updated");*/
ResultSet rs=stmt.executeQuery();  
ResultSetMetaData rsmd = rs.getMetaData();
int columnsNumber = rsmd.getColumnCount();
System.out.println(columnsNumber+"after"+rsmd.getColumnName(2));
int i=1;
while(rs.next())
{
    
Blob b=rs.getBlob(3);//2 means 2nd column data  
byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  
FileOutputStream fout=new FileOutputStream("d:\\dd\\"+i+rs.getString(1));  
fout.write(barr);  i++;
fout.close();  
}
System.out.println("ok");  
con.close();  
  
}
catch(Exception e)
{ System.out.println(e);
}  

      
   }
}


  