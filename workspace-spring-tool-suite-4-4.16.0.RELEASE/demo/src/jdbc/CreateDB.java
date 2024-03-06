package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CreateDB {
	static Connection c;
	 Scanner sc=new Scanner(System.in);
	CreateDB() throws SQLException
	{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	
		c=DriverManager.getConnection("jdbc:mysql://localhost:3306/intro_sql","root","root");
	}
	catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	public void createTable() {
		// TODO Auto-generated method stub
		
		String create_query= "create table employeedetails(eid int,ename varchar(25),salary int)";
		try {
			Statement st = c.createStatement();			 					
			st.execute(create_query);
		   
		}
	    catch(SQLException e){
				e.printStackTrace();
		}
	}
	public void insertvalues() {
		String insert_query="insert into employeedetails values (?,?,?)";
		try {
			PreparedStatement ps= c.prepareStatement(insert_query);
		
		   
		    System.out.println("enter employee id");
		    int eid=sc.nextInt();
		    System.out.println("enter employee name");
		    String ename=sc.next();
		    System.out.println("enter salary");
		    int salary=sc.nextInt();
		    
		    
		    ps.setInt(1, eid);
		    ps.setString(2, ename);
		    ps.setInt(3, salary);
		
		int rows =ps.executeUpdate();
		System.out.println("rows inserted:"+rows);
		select();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public void updateTable() {
		String update_query="update employeedetails set eid =? where ename=? ";
		try {
			
			PreparedStatement ps1=c.prepareStatement(update_query);
						
			
			System.out.println("Enter employee name :");
			String ename1=sc.next();
			System.out.println("Enter employeeId for "+ename1);
			int eid1=sc.nextInt();
			
			
			ps1.setInt(1, eid1);
			ps1.setString(2, ename1);
			int urows=ps1.executeUpdate();
			
			System.out.println("Rows updated:"+urows);
			select();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void deleterows() {
		String delete_query="delete*table employeedetails where eid=? ";
		try {
			PreparedStatement ps2=c.prepareStatement(delete_query);
			
			System.out.println("Enter employeeId ");
			int eid1=sc.nextInt();
			
			
			ps2.setInt(1, eid1);
			//ps2.setString(2, ename1);*/
			boolean urows=ps2.execute();
			
			System.out.println("Rows updated:"+urows);
			select();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}


	private void select() {
String select_query="select*from employeedetails";
		
		try {
			Statement st= c.createStatement();
			
			ResultSet rs;
			rs = st.executeQuery(select_query);
			while(rs.next())
			{
				System.out.println("EmployeeId: "+rs.getInt(1)+"  "
						+ "employee Name: "+rs.getString(2)+" Salary: "+rs.getInt(3));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	public static void main(String[] args) throws SQLException {
		CreateDB cdb=new CreateDB();
		//String select_query="select*from employeedetails";
		//cdb.createTable();
		//cdb.insertvalues();
		//cdb.updateTable();
		cdb.deleterows();
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*String insert_pq="insert into orders values (?,?,?) ";
		String update_query="update orders set ord_id =? where ord_name=?";
		
try {
			
			CreateDB c1=new CreateDB();
					//insert
			PreparedStatement ps=c.prepareStatement(insert_pq);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter ord_id");
			int ord_id=sc.nextInt();
			System.out.println("Enter ord_date");
			String ord_date=sc.next();
			System.out.println("Enter shipper");
			String shipper=sc.next();
						
			ps.setInt(1,ord_id );
			ps.setString(2, ord_date);
			ps.setString(3, shipper);
			
			int rows=ps.executeUpdate();
			System.out.println("Rows inserted:"+rows);
			select();
			
						//update
			PreparedStatement ps1=c.prepareStatement(update_query);
			
			
			System.out.println("Enter foodName");
			String fname1=sc.next();
			System.out.println("Enter calories for "+fname1);
			int cal1=sc.nextInt();
			
			ps1.setInt(1, cal1);
			ps1.setString(2, fname1);
			int urows=ps1.executeUpdate();
			
			System.out.println("Rows updated:"+urows);
			select();
					
			
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void select() {
		// TODO Auto-generated method stub
		String select_query="select * from orders";
         
		try {
			Statement st1 = c.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		     ResultSet rs; 
		
			
		
	}
	
		

}*/
