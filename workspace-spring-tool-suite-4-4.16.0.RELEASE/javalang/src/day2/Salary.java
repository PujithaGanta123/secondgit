package day2;

public class Salary{
	 
		public static void main(String[] args) {
			sub s1=new sub(30000,2500);
			System.out.println("Salary:"+(s1.display().sal+s1.display().bonus));
			
	 
		}
	 
	}
	class Super
	{
		float sal;
		Super(float sal)
		{
			this.sal=sal;
		}
		Super display()
		{		
			return new Super(sal);
		}
		
	}
	class sub extends Super
	{
		
		float bonus;
		sub(float sal, float bonus)
		{
			super(sal);
			this.bonus=bonus;
		}
		sub display()
		{
			return new sub(sal,bonus);
		}
		
	}
	 

