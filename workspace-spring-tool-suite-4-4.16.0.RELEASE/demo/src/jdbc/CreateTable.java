package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CreateTable {
	
	
	static Connection c;
	CreateTable() 
	{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		c=DriverManager.getConnection("jdbc:mysql://localhost:3306/intro_sql","root","root");
	}
	catch(ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
	}

	public void createTable() {
		// TODO Auto-generated method stub
		
		String create_query= "create table college(cid int primary key,cname varchar(25),branch varchar(10))";
		try {
			Statement st = c.createStatement();			 					
			st.execute(create_query);
		   
		}
	    catch(SQLException e){
				e.printStackTrace();
		}
	}
	public void createTable2() {
		// TODO Auto-generated method stub
		
		String create_query= "create table studentlist(stlogin int primary key, cid int,cname varchar(25),fees int,foriegn key(cid) references college(cid))";
		try {
			Statement st = c.createStatement();			 					
			st.execute(create_query);
		   
		}
	    catch(SQLException e){
				e.printStackTrace();
		}
	}
	
	public void insertValues() {
		String insert_query="insert into student values (?,?,?)";
		try {
			PreparedStatement ps= c.prepareStatement(insert_query);
		
		    Scanner sc=new Scanner(System.in);
		    System.out.println("enter studnet login id");
		    int slid=sc.nextInt();
		    System.out.println("enter college id");
		    int cid=sc.nextInt();
		    System.out.println("enter student name");
		    String cname=sc.next();
		    System.out.println("enter fees");
		    int fees=sc.nextInt();
		    
		    ps.setInt(1, slid);
		    ps.setInt(2, cid);
		    ps.setString(3, cname);
		    ps.setInt(4, fees);
		
		int rows =ps.executeUpdate();
		System.out.println("rows inserted:"+rows);
		select();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	
	
	public void select() {
		String select_query="select*from student";
		
		try {
			Statement st= c.createStatement();
			
			ResultSet rs;
			rs = st.executeQuery(select_query);
			while(rs.next())
			{
				System.out.println("collegeId: "+rs.getInt(1)+"  "
						+ "studentName: "+rs.getString(2)+" fees: "+rs.getInt(3));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	public void join() {
		String jq="select c.cid,c.cname,c.branch,s.cid,s.slid,s.name,s.fees from course c, studentlist  where c.cid=s.cid";
		try {
			Statement s=c.createStatement();
			ResultSet rs=s.executeQuery(jq);
			while(rs.next())
			{
				System.out.println("collegeId: "+rs.getInt(1)+"  "
						+ "studentName: "+rs.getString(2)+"Student login ID: "
						+rs.getInt(3)+"Branch: "+rs.getString(4)+"fees: " +rs.getInt(4));
				}
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public static void main(String [] args) {
		CreateTable ct= new CreateTable();
			
		//String select_query="select*from student";
		//ct.createTable();
		//ct.insertValues();
		//ct.createTable2();			
		
	}
}


























/*String jq="select c.cid,c.cname,p.pid,p.pname from course c, professor p where c.cid=p.cid";
try {
	Statement s=c.createStatement();
	ResultSet rs=s.executeQuery(jq);
	while(rs.next())
	{
		System.out.println("course Id :"+rs.getString(1)+" course Name: "+rs.getString(2)+
				" professor Id :"+rs.getString(3)+" professor Name: "+rs.getString(4));
	}
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}*/






	
	
		
		
		
	
	
	
	
	
	
			
			


		

	


