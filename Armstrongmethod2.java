import java.util.Scanner;
class MyClass
{
int num;
public void method2(int count,int result,int temp)
{
 
while(num!=0)
{
count++;
num/=10;
}
num=temp;
while(num!=0)
{
int rem=num%10;
result=(int)(result+Math.pow(rem,count));
num/=10;
}
if(temp==result)
System.out.println("armstrong number");
else
System.out.println("not armstrong number");
}
}
class Armstrongmethod2
{
public static void main(String args[])
{
Scanner arm=new Scanner(System.in);
System.out.println("enter the number");
int num=arm.nextInt();
MyClass obj=new MyClass();
obj.method2(0,0,obj.num);
}
}
the output is doubt so clarified