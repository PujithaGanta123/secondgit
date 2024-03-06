package chapterService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cg.bean.Chapter;

import book.Book;

public class ChapterService {
private Connection connect=null;
	
	public ChapterService()
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
	public void persistCHObject(Chapter ch) {
		
		String insert_pquery="insert into Chapter values(?,?,?,?)";
		
		try {
			
			//statement
			PreparedStatement ps=connect.prepareStatement(insert_pquery);
			
			//set values
			ps.setInt(1, ch.getCid());
			ps.setInt(2, ch.getBid());
			ps.setString(3, ch.getCname());
			ps.setFloat(4, ch.getNop());
			//execute
			ps.executeUpdate();
			ps.close();
		}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
						
		
		}
	public Chapter retrieve(int cid) {
		String select_query="select * from Chapter where bid=?";	
		PreparedStatement ps;
		Chapter c=new Chapter();
		try {
			ps = connect.prepareStatement(select_query);
			ps.setInt(1, cid);
			
			
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
			c.setCid(rs.getInt(1));
			c.setBid(rs.getInt(2));
			c.setCname(rs.getString(3));
			c.setNop(rs.getInt(4));
			
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}

}
