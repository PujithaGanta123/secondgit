class ArithOp
{
int a=10;
int b=12;
int c; 
public static void main (String a[])
{
ArithOp o1=new ArithOp();
o1.add();
ArithOp.message();
}
public void add()

{
c=a+b;
System.out.println("sum:"+c);
}
public static void message()
{
System.out.println("welcome to java");
}
}

