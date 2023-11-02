import java.util.Scanner;
class reverse1
{
public static void main(String args[])
{
Scanner a=new Scanner(System.in);
System.out.println("enter the value");
Reverse4 ro=new Reverse4();
ro.num=a.nextInt();
ro.method();
}
}
class Reverse4
{
int num;
int temp;
int rev=0;
public void method()
{
temp=num;
while(num!=0)
{
int rem=num%10;
rev=rev*10+rem;
num/=10;
}
System.out.println(rev+" ");
}
}



