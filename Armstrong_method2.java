import java.util.Scanner;
class Armstrong_method2
{
public static void main(String args[])
{
Scanner a=new Scanner(System.in);
System.out.println("enter the value");
arm3 ar=new arm3();
ar.num=a.nextInt();
ar.method7(ar.num,0);
}
}
class arm3
{
int num;
int sum=0;
int count=0;
public void method1(int num,int rev)
{
int temp=num;
temp=num;
int rem=num%10;
sum=sum+(int)Math.pow(count,rem);
num/=10;
}
public void method7(int num,int rev)
{
 int temp=num;
if(sum==temp)
System.out.println("arm no");
else
System.out.println("not arm no");
}
}




