class pattern_diagonal_right
{
public static void main(String args[])
{
for(int x=1;x<=5;x++)
{
for(int y=1;y<=5;y++)
{
if(x+y==5+1)
System.out.print("# ");
else
System.out.print("* ");
}
System.out.println();
}
}
}
