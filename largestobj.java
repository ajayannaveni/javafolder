import java.util.Scanner;                                                          
class Largest1
{
int num;
int num1;
int num2;
int num3;
int num4;
public void method()
{
if(num>num1 && num>num2 && num>num3)
System.out.println("num is greatest");
else if(num1>num && num1>num2 && num1>num3)
System.out.println("num1 is greatest");                                          
else if(num2>num && num2>num1 && num2>num3)
System.out.println("num3 is greastest");
else
System.out.println(num4+"is greater");
}
}
class Largestobj
{
public static void main(String args[])
{
Scanner l=new Scanner(System.in);
System.out.println("enter number");
Largestobj obj=new Largestobj();
obj.num=l.nextInt();
obj.num1=l.nextInt();
obj.num2=l.nextInt();
obj.num3=l.nextInt();
obi.num4=l.nextInt();
obj.method();
}

