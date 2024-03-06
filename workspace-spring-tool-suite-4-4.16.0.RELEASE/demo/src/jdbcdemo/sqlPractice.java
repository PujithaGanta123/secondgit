package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class sqlPractice {

	public static void main(String[] args) {
		String sql_query="select * from customer";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/intro_sql", "root", "root");
			Statement st=c.createStatement();
			ResultSet rs= st.executeQuery(sql_query);
			
			
			while(rs.next())
			{
			System.out.println("CustomerId: "+rs.getInt(1)+"  Cutomer Name: "+rs.getString(2));
			}
				
			
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
