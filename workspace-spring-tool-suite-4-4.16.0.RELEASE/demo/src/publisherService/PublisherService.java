package publisherService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.Flow.Publisher;




public class PublisherService{
	private Connection connect=null;
	public PublisherService()
	{
	//load driver
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//connection
		connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/intro_sql","root","root");
		} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
			} catch (SQLException e) {
		// TODO Auto-generated catch block
				e.printStackTrace();
				}
		}
	public void persistObject(Publisher p )
	{
		String insert_pquery="insert into publisher values(?,?,?)";
		try {
		
		//statement
			PreparedStatement ps=connect.prepareStatement(insert_pquery);
		
		//set values
			ps.setInt(1, p.getPid());
		    ps.setString(2, p.getPname());
		    ps.setInt(3, p.getNumberofbooks());
		    //execute
		    ps.executeUpdate();
		    ps.close();
		    } catch (SQLException e) {
		// TODO Auto-generated catch block
		    	e.printStackTrace();
		    	}
		}
	public Publisher retrieve(int pid)
	{
		String select_query="select * from Publisher where pid=?";	
		PreparedStatement ps;
	    Publisher p=new Publisher();
	    try {
	    	ps = connect.prepareStatement(select_query);
		    ps.setInt(1, pid);
		    ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			p.setPid(rs.getInt(1));
	        p.setPname(rs.getString(2));
	        p.setNumberofbooks(rs.getInt(3));
	        //return p;
	        }
		} catch (SQLException e) {
	       // TODO Auto-generated catch block
			e.printStackTrace();
			}
	return p;
		
			
		
		
	}

}
