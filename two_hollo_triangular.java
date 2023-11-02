class pattern_two_hollo_triangular
{
public static void main(String args[])
{
Scanner aj=new Scanner(System.in);
System.out.println("enter row");
int row=aj.nextInt();
for(int x=1;x<=row;x++)
{
for(int y=row;y>=x;y--)
{
System.out.print(" ");
}
for(int z=1;z<=x;z++)
{
System.out.print(" ");
}
System.out.println();
}
}
}
