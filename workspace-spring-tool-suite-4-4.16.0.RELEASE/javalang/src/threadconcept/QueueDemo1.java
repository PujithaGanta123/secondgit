package threadconcept;

class Queue{
	
int front;
int rear;
int[] arr;
 
Queue()
{
   front=rear=-1;//empty
   arr=new int[10];
  }
  //push
  void enqueue(int a)
  {
    if(rear==arr.length-1)
		System.out.println("overflow");
	else
		arr[++rear]=a;//a[0]=1 rear=0/1/2 a[1]=2 a[2]=3
	
	if(front==-1)
		front++;//front=0
   }
   //pop
   int dequeue()
   {
     int x=-1;
	 if(front==-1)
		System.out.println("underflow");
	 else
		x=arr[front++];//x=arr[front]x=a[0]=1//front=1
	 if(rear==0)//last element
	     rear--;
	 return x;
    }
	
	void display()
	{
	  for(int i=front;i<=rear;i++)
		System.out.print(arr[i]+" ");
 
	 System.out.println();
 
 
	}
}
 

public class QueueDemo1 {
	public static void main(String[] args) {
		  Queue ob=new Queue();
		  ob.enqueue(10);
		  ob.enqueue(11);
		  ob.enqueue(12);
		  ob.enqueue(13);
		  ob.display();//10 11 12 13
		  System.out.println("Deleted:"+ob.dequeue());//10
		  ob.display();//11 12 13
		  ob.enqueue(14);
		  ob.enqueue(15);
		  ob.display();//11 12 13 14 15
		  
		  
		  
	 }
  
	

	

}
