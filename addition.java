import java.util.Scanner;
 class User
{
int num;
int num1;
public void method()
{
   int sum=(num+num1);
  System.out.println("sum="+sum);
  }
}
class addition
{
 public static void main(String args[])
  { 
Scanner add=new Scanner(System.in);
System.out.println("enter the first number");
User obj=new User();
obj.num=add.nextInt();
System.out.println("enter the second number");
obj.num1=add.nextInt();
obj.method();
}
}
