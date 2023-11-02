import java.util.Scanner;
class arm1
{
int num;
int temp;
int sum=0;
int count=0;
public int method4()
{
temp=num;
while(num!=0)
{
count++;
num/=10;
}
return count;
}
public int method5()
{
num=temp;
while(num!=0)
{

int rem=num%10;
sum=sum+(int)Math.pow(count,rem);
num/=10;
}
return sum;
}
public String method6()
{
temp=num;
if(sum==temp)
return "arm no";
else
return "not arm no.";
}
}
class Armstrong_method1
{
public static void main(String args[])
{
Scanner a=new Scanner(System.in);
System.out.println("enter the value");
arm1 ar1=new arm1();
ar1.num=a.nextInt();
System.out.println(ar1.method6());
}
} 

