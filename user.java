import java.util.Scanner;
public class Classobjects
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the value");
User obj=new User();
User obj1=new User();
User obj2=new User();
//'n' of class obj can be created
obj.num=s.nextInt();
obj.method1();
}
}
class User
{
int num;
public void method1()
{
int count=0;
for(int i=2;i<=num;i++)
{
if(num%i==0)
{
count++;
break;
}
if(count==0&&num!=1&&num!=0)
{
System.out.println("it is prime");
}
else
System.out.println("it is not prime");
}
}
}


