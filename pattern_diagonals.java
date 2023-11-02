class pattern_diagonals
{
public static void main(String args[])
{
int row=10,col=10;
for(int x=1;x<=row;x++)
{
for(int y=1;y<=col;y++)
{
if((x==y)||(x+y==10+1))
System.out.print("* ");
else
System.out.print(" ");
}
System.out.println();
}
}
}