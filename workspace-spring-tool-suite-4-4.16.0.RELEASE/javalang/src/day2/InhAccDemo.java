package day2;

public class InhAccDemo {
	
	
	 
		public static void main(String[] args) {
			
			PGStudent s1=new PGStudent(100,"DDD",5,89.5f);
			//s1.init(101, "CCC");
			s1.display();
			//s1.show();
			UGStudent s2=new UGStudent(101,"EEE",8,true);
			s2.display();
		}
	 
	}
	class Student
	{
		int rollno;
		String name;
		
		Student(int rollno,String name)
		{
			this.name=name;
			this.rollno=rollno;
		}
		
		void display()
		{
			System.out.println("Name:"+name+"RollNo:"+rollno);
		}
		
	}
	class CollegeStudent extends Student
	{
		int sem;
		CollegeStudent(int rollno, String name,int sem) {
			super(rollno, name);
			this.sem=sem;
		}
	 
	 
		
		//method overriden
		public void  display()
		{
			
			System.out.println("Child class:Name:"+name+"RollNo:"+rollno+"Sem:"+sem);
		}
	}
	class PGStudent extends CollegeStudent
	{
		float percentage;
	 
		PGStudent(int rollno, String name, int sem,float percentage) {
			super(rollno, name, sem);
			this.percentage=percentage;
		}
		public void  display()
		{
			
			System.out.println("Child class:Name:"+name+"RollNo:"+rollno+"Sem:"+sem+"Percentage:"+percentage);
		}
		
		
	}
	class UGStudent extends CollegeStudent
	{
		 boolean placed;
		UGStudent(int rollno, String name, int sem,boolean placed) {
			super(rollno, name, sem);
			this.placed=placed;
			
		}
		public void  display()
		{
			
			System.out.println("Child class:Name:"+name+"RollNo:"+rollno+"Sem:"+sem+"Placed:"+placed);
		}
	}

