import java.util.Scanner;
class ppppp
{
public static void main(String args[])
{
Scanner aj=new Scanner(System.in);
System.out.println("enter row");
int row=aj.nextInt();
for(int x=1;x<=row;x++)
{
for(int y=1;y>x;y--)
{
System.out.print("  ");
}
for(int z=row;z>=x;z--)
{
System.out.print("1 ");
}
System.out.println();
}
}
}
