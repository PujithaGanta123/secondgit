package dsDay1;

public class InsertArra {

	public static void main(String[] args) {
		//array a
				int a[]=new int[5];
				//enter elements
				a[0]=10;
				a[1]=12;
				a[2]=14;
				a[3]=16;
				a[4]=18;
				
				//get element for insert// 13 pos=2
				
				//1)create another array(b)with size of previous array(a) size+1
				int b[]=new int[6];
				int s=13;
				int pos=2;	
				//2) Repeat  copy element from a from index  0 till pos-1
				for(int i=0;i<=pos-1;i++)
				{
					b[i]=a[i];
				}
				//3)insert element at pos
				b[pos]=s;
				
				//4)Repeat  copy element from a from index  pos+1 till b size-1
		 
				for(int i=pos+1;i<=b.length-1;i++)
				{
				b[i]=a[i-1];
				}
				for(int i=0;i<=b.length-1;i++)
				{
					System.out.println("b["+i+"]="+b[i]);
				}
				
				
				/*for(int i:b)
				{
					System.out.println(i);
				}*/
				
		 
			}

	}


