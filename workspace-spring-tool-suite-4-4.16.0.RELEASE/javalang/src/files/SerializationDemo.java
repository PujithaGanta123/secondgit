package files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {
	private int prn;
	private String name;
	private String email;
	private String password;
	private double gpa;
	private String dob;

	SerializationDemo(int prn,String name,String email,String password,double gpa,String dob)
	{
		if(validation(email,password,gpa,dob))
		{
			this.prn = prn;
			this.name = name;
			this.email=email;
			this.password=password;
			this.gpa = gpa;
			this.dob = dob;
					
		}
	}
	
	

		private boolean validation(String email, String password, double gpa, String dob) {
		// TODO Auto-generated method stub
		return false;
	}
		public static void main(String[] args) throws IOException, ClassNotFoundException {
		YP y1=new YP(10,"Yaswanthi");
		String path="C:\\Users\\GAPUJITH\\Documents\\workspace-spring-tool-suite-4-4.16.0.RELEASE\\javalang\\src\\files\\SerializationDemo.java";
		//Object serialization
		FileOutputStream fos =new FileOutputStream(path);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		 oos.writeObject(y1);
		 System.out.println("Finished writing");
		 fos.close();
		 oos.close();
		
		 //Object deserialization
		 YP y2;
		 FileInputStream fis =new FileInputStream(path);
		 ObjectInputStream ois=new ObjectInputStream(fis);
		
		 y2=(YP) ois.readObject();
		 fis.close();
		 ois.close();
		 System.out.println(y2);//
		
 
	}

 
}
class YP implements Serializable
{
	private int empid;
	private String name;
	YP(int empid,String name)
	{
		this.empid=empid;
		this.name=name;
	}
	public String toString()
	{
		return "Name:"+name+" "+"EmpId: "+empid;
	}

}
