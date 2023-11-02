import java.util.Scanner;
class Dowhileloop
{
public static void main(String args[])
{
int i;
Scanner d=new Scanner(System.in);
do{
System.out.println("enter value to check");
i=d.nextInt();
String decision;
if(i%2==0)
System.out.println("even");
else
System.out.println("odd");
System.out.println("Do you want to continue");
decision=d.next();
if(decision.equals("no"))
{
break;
}
}while(true);
}
}

