import java.util.Scanner;
class User
{
int num;
public void method1()
{
int rev=0,rem=0,temp=num;
while(num!=0)
{
rem=num%10;
rev=rev*10+rem;
num/=10;
}
if(temp==rev)
System.out.println("palindrome");
else
System.out.println("not palindrome");
}
}
public class  Palindromeobj
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
User obj=new User();
obj.num=s.nextInt();
obj.method1();
}
}
