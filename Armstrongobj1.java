import java.util.Scanner;
public class Armstrongobj1
{
public static void main(String args[])
{
Scanner a=new Scanner(System.in);
System.out.println("enter the number");
Armstrongobj obj=new Armstrongobj();
obj.num=a.nextInt();
obj.num1=20;// the num also  assign
obj.method();
}
}
class Armstrongobj
{
int num;
int num1;
public void method()
{
int rem=0,result=0,count=0,temp=num;
while(num!=0)
{
count++;
num/=10;
}
temp=num;
while(num!=0)
{
rem=num%10;
result=(int)Math.pow(rem,count);
num/=10;
}
if(temp==result)
System.out.println("armstrong number");
else
System.out.println("not armstrong number");
System.out.println("num1 value "+num1);
}
}
