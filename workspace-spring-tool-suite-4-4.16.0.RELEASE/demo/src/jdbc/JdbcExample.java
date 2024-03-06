package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample {
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "root");
			
			Statement st=c.createStatement();
			Statement st1=c.createStatement();
			
			
			ResultSet rs= st.executeQuery("select cid,cname from customer where cid \r\n"
					+ "in(select cid from cust_department where deptname in ('sales','HR') );");
			ResultSet rs1=st1.executeQuery("select c.cid,c.cname, d.deptid,d.deptname,d.cid "
					+ "from customer c right outer join cust_department d on c.cid=c.cid");
					 

			
			
			while(rs1.next())
			{
			System.out.println("CustomerId: "+rs1.getInt(1)+"  Customer Name: "+rs1.getString(2));
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
