class Largest1
{
public void method()
{
int num;
int num1;
int num2;
int num3;
if(num>num1?num>num2:num>num3)
System.out.println("num is greatest");
else if(num1>num?num1>num2:num1>num3)
System.out.println("num1 is greatest");
else if(num2>num?num2>num1:num2>num3)
System.out.println("num3 is greastest");
}
}
class Largestobj
{
public static void main(String args[])
{
Scanner l=new Scanner(System.in)
System.out.println("enter number");
largest obj=new largest;
int num=l.nextInt();
obj.method();
}
}