class pattern_diagonals3
{
public static void main(String args[])
{
int row=5;
for(int x=1;x<=row;x++)
{
for(int y=1;y<=row;y++)
{
if((x+y==row+1)||(x==y)||(x==1)||(x==5)||(y==1)||(y==5))
System.out.print("# ");
else
System.out.print("  ");
}
System.out.println();
}
}
}