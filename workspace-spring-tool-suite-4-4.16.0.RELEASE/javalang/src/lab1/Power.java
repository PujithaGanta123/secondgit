package lab1;
import java.util.Scanner;
public class Power {
static int number;
public static void main(String[]arg)
{
	    Scanner in= new Scanner(System.in);
	    number = in.nextInt();
	    in.close();
	    if(isPowerOfTwo()) {
		  System.out.println("yes");
	    }
	    else
	    {
		System.out.println("no");
	    }
     }
  static boolean isPowerOfTwo() {
	  if (number % 2!=0)
	  {
		  return false;
	  }
	  else
	  {
		  for(int i=0;i<-number;i++)
		  {
			  if(Math.pow(2, 1)== number)
				  return true;
		  }
	  }
	return false; 
  }
}
