package threadconcept;
import java.util.*;
class task{
	static int[] a;
	static int top;

class Stack implements Runnable
{
  // static int[] a;
   //static int top;
   Stack()
   {	
	a=new int[2];
	top=-1;
   }

  public static synchronized void push(int x)
  {	
	if(top==a.length-1)
	  System.out.println("overflow");
	else
	 a[++top]=x;
   }
   public synchronized int pop()
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


public class StackDemo1
{
	public static void main(String args[])
	{
		Stack s=new Stack();
		Thread t1=new Thread( new Stack(s));
		Thread t2=new Thread(new Stack(s));
		t1.start();
		t2.start();
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
					 System.out.println("\n enter the value ");
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
			 System.out.println("\n do u want to count... ");
			}while(in.nextInt()==1);

	}
}
}

