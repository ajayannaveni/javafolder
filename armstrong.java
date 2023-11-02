import java.util.Scanner;
class armstrong1
{
  int num;
public void method()
{
int temp=num,rem=0,count=0,sum=0;
  while(num!=0)
{
   count++;
}
   while(num!=0)
 {
   rem=num%10;
   num=num/10;
   sum=sum+(int)Math.pow(rem,count);

 }
if(sum==temp)
System.out.println("armstrong number");
else
System.out.println("not a armstrong no.");
System.out.println(sum);
}
}
public class armstrong
{
 public static void main(String args[])
{
Scanner arm=new Scanner(System.in);
System.out.println("enter the number");
armstrong1 obj=new armstrong1();
obj.num=arm.nextInt();
obj.method();
}
}
