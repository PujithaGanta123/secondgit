package assessment;

public class Pyramid 
{
	public static void main(String arg[]) 
	{
		int n=3;
	    for(int i=1;i<=n;i++)
	    {
	    	for(int j=n-i;j>0;j--)
	    	{
	    		System.out.print(" "); 
	    	}
	    	for(int s=i;s>=1;s--){
	    		System.out.print(s);
	    		}
	    	for(int k=2;k<=i;k++){
	    		System.out.print(k);
	    		}
	    	System.out.println();
	    	}
	    }
	}

