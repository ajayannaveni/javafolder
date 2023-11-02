class pattern_hollo_right_rev_triangular
{
public static void main(String args[])
{
Scanner aj=new Scanner(System.in);
System.out.println("enter row");
int row=aj.nextInt();
for(int x=1;x<=row;x++)
{
for(int y=1;y<=x;y++)
{
System.out.print(" ");
}
for(int z=row;z>=x;z--)
{
if(x==1||x==z||z==row)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}
}