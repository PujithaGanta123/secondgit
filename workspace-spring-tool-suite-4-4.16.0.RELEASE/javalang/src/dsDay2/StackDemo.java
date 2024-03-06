package dsDay2;

import java.util.*;
public class StackDemo{
	public static void main(String[]arg) {
		Stack s=new Stack();
		System.out.println(s.isEmpty());
		s.push(new Employee(3456,"pujitha"));
		s.display();
		s.push(new Employee(3457,"bindu"));
		s.display();
		System.out.println("peek element is"+"Id:"+s.peek().id+"name"+s.peek().name);
		System.out.println("pop element is"+"Id:"+s.pop().id+"name"+s.pop().name);
		
	}
}



class Stack {
	Employee [] a;
	int top;
	Stack(){
		a=new Employee[2];
		top=-1;
	}
	void push(Employee x) {
		if(top==a.length-1)
			System.out.println("overflow");
		else
			a[++top]=x;
	}
	Employee pop() {
		if(top==-1) {
			System.out.println("underflow");
		    return null;
		}
		else
		return(a[top--]);
	}
	void display()
	{
		for(int i=0;i<=top;i++)
			System.out.print("id:"+a[i].id+" name:"+a[i].name);
		System.out.println();	
	}
	
	boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;
	}
	Employee peek()
	{
		if(top==-1)
			return null;
		    return (a[top]);
	}
}
class Employee{
	int id;
	String name;
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}
	
		 /*  int [] a;
		   int top;
		   Stack()
		   {	
			a=new int[2];
			top=-1;
		   }
		  
		  void push(int x)
		  {	
			if(top==a.length-1)
			  System.out.println("overflow");
			else
			 a[++top]=x;
		   }
		   
		   int pop()
		   {
		     if(top==-1)
				{
		    	 System.out.println("underflow");
			     return -1;
				}
			 else
			   return(a[top--]);
			}
			
			void display()
			{
				for(int i=0;i<=top;i++)
					System.out.print(a[i]+" ");
				System.out.println();	
			}
			
			boolean isEmpty()
			{
				if(top==-1)
					return true;
				else
					return false;
			}
			
			int peek()
			{
				if(top==-1)
					return -1;
				return (a[top]);
			}
			
			
		}

		public class StackDemo
		{
			public static void main(String args[])
			{
				
				Stack s=new Stack();
				Scanner in= new Scanner(System.in);
				
				 do
					{System.out.println("\n******** MENU *******");
					 System.out.println("\n1.PUSH");
					 System.out.println("\n2.POP");
					 System.out.println("\n3.PEEK");
					 System.out.println("\n4 IS EMPTY");
					 System.out.println("\n5.EXIT");
					 System.out.println("\n enter ur choice : ");
					 switch(in.nextInt())
						{
						 case 1:
							 System.out.println("\nenter the value ");
							 s.push(in.nextInt());//insertion
							 break;
						 case 2:
							System.out.println("\n popped element : "+ s.pop());//deleting
							 break;
						
						case 3:
							System.out.println("\n top element : "+ s.peek());//retrieve
							 break;
						 case 4: System.out.println("\n is empty : "+ s.isEmpty());
								 break;
						 case 5: System.exit(0);
								 break;
						 default: System.out.println("\n Wrong Choice!");
								  break;
						}
					 System.out.println("\n do u want to cont... ");
					}while(in.nextInt()==1);

			}
		


class Employee{
	int id;
	String name;
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}*/

	


