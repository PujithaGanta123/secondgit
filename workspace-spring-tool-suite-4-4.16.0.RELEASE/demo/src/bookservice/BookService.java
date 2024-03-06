package bookservice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import book.Book;

public class BookService {
private Connection connect=null;
	
	public BookService()
	{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/intro_sql","root","root");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	public void createTable() {
		// TODO Auto-generated method stub
		
		String create_query= "create table book(pid int primary key,bid int,bname varchar(25),price decimal)";
		try {
			Statement st = connect.createStatement();			 					
			st.execute(create_query);
		   
		}
	    catch(SQLException e){
				e.printStackTrace();
		}
	}
		public void persistObject(Book b) {
			
			String insert_pquery="insert into book values(?,?,?,?)";
			
			try {
				
				//statement
				PreparedStatement ps=connect.prepareStatement(insert_pquery);
				
				//set values
				
				ps.setInt(1, b.getBid());
				ps.setString(2, b.getBname());
				ps.setInt(3, b.getPid());
				ps.setFloat(4, b.getPrice());
				//execute
				ps.executeUpdate();
				ps.close();
			}
				catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
							
			
			}
		public Book retrieve(int bid) {
			String select_query="select * from Book where pid=?";	
			PreparedStatement ps;
			Book b=new Book();
			try {
				ps = connect.prepareStatement(select_query);
				ps.setInt(1, bid);
				
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
				b.setPid(rs.getInt(1));
				b.setBname(rs.getString(2));
				b.setBid(rs.getInt(3));
				
				b.setPrice(rs.getInt(4));
				
				}
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			
			return b;	

}
}
