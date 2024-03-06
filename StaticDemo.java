class StaticDemo
{
int i=0;
 int j=0;
public static void main(String ar[])
{
StaticDemo s1 =new StaticDemo();
StaticDemo s2 =new StaticDemo();
s1.change();
s2.change();
System.out.println(s1.i+"  "+s2.j);
}
public void change()
{
while(i<5){
i++;
J++;
   }
}
}