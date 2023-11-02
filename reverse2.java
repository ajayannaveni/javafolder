import java.util.Scanner;
class reverse2
{
public static void main(String args[])
{
Scanner p=new Scanner(System.in);
System.out.println("enter the number");
reverse1 rt=new reverse1();
rt.num=p.nextInt();
rt.method1(rt.num);
}
}

class reverse1
{
int num;
int temp,rev;
public void method1(int num)
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


