import java.util.Scanner;
class arm
{
int num;
int temp;
int count=0;
int sum=0;
public void method1()
{
temp=num;
while(num!=0)
{
count++;
num/=10;
}
}
public void method2()
{
num=temp;
while(num!=0)
{
int rem=num%10;
sum=sum+(int)Math.pow(count,rem);
num/=10;
}
}
public void method3()
{
temp=num;
if(sum==temp)
System.out.println("arm no");
else
System.out.println("not arm no.");
}
}
class Armstrong_method
{
public static void main(String args[])
{
Scanner a=new Scanner(System.in);
System.out.println("enter the value");
arm ar=new arm();
ar.num=a.nextInt();
ar.method3();
}
}

