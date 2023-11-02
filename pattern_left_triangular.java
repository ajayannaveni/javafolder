import java.util.Scanner;
class pattern_left_triangular
{
public static void main(String args[])
{
Scanner aj=new Scanner(System.in);
System.out.println("enter rows");
int row=aj.nextInt();
for(int x=1;x<=row;x++)
{
for(int y=1;y<=x;y++)
{
System.out.print("  ");
}
for(int z=row;z>=x;z--)
{
System.out.print("* ");
}
System.out.println();
}
}
}

