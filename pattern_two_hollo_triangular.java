import java.util.Scanner;
class pattern_two_hollo_triangular
{
public static void main(String args[])
{
Scanner aj=new Scanner(System.in);
System.out.println("enter row");
int row=aj.nextInt();
for(int x=1;x<=row;x++)
{
for(int y=row;y>x;y--)
{
System.out.print("  ");
}
for(int z=1;z<=x;z++)
{
if(z==1||x==z)
System.out.print("* ");
else
System.out.print("  ");
}
System.out.println();
}
for(int x=2;x<=row;x++)
{
for(int y=1;y<x;y++)
{
System.out.print("  ");
}
for(int z=row;z>=x;z--)
{
if(z==row||z==1||x==z)
System.out.print("* ");
else
System.out.print("  ");
}
System.out.println();
}
}
}
