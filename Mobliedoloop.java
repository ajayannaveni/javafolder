import java.util.Scanner;
class Mobliedoloop
{
public static void main(String args[])
{
int a;
Scanner m=new Scanner(System.in);
do{
System.out.println("hello what would you like to purchase");
i=m.next();
String decision;
System.out.println("1.realme 9 pro-19000/-");
System.out.println("2.samsung grand prime pro-15000/-");
System.out.println("3.10 or -13000/-");
System.out.println("4 iphone 13-50499/- ");
System.out.println("5.apple iphone 15-80000/-");
System.out.println("6.apple iphone 15pro-160000/-");
System.out.println("do you want to continue");
decision=m.next();
if(decision.equals("no"))
{
break;
}
}while(true);
}
}







