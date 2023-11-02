import java.util.Scanner;
class Reverse1
{
public static void main(String args[])
{
Scanner a=new Scanner(System.in);
System.out.println("enter the value");

reverse ro=new reverse();
ro.num=a.nextInt();
ro.method();

reverse2 rt=new reverse2();
rt.num=a.nextInt();
rt.method1(rt.num);

reverse3 rf=new reverse3();
rf.num=a.nextInt();
System.out.println(rf.method2());

}
}
class reverse
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

class reverse2
{
int num;
int temp,rev;
public void method1(int num)
{
System.out.println("m2");
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

class reverse3
{
int num;
int temp;
int result;
public int method2()
{
System.out.println("m3");
temp=num;
int rev=0,rem=0;
temp=num;
while(num!=0)
{
 rem=num%10;
 rev=rev*10+rem;
num/=10;
}
return rev;
}
}



