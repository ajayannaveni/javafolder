import java.util.Scanner;
class MyClass
{
int num;
public void method1()
{
System.out.println("i am Method");
int start=1,result=1;
for(;start<=num;start++)
{
result=result*start;//1*1=1,1*2=2,2*3=6,6*4=24,24*5=120;
}
System.out.println(result);
}
public void method2()
{
System.out.println("i am Method");
method1();
 }
public void method3(int a,int b)
{
System.out.println("i am method2");
for(;a<=num;a++)
{
b*=a;//2*3=6,6*4=24,24*5=120
}
System.out.println(b);
}
}
class Methods
{
public static void main(String args[])
{
Scanner m=new Scanner(System.in);
System.out.println("enter the value"); 
MyClass obj=new MyClass();
obj.num=m.nextInt();
obj.method1();
obj.method2();
obj.method3(3,2);
}
}
