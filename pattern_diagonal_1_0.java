class pattern_diagonal_1_0
{
public static void main(String args[])
{
for(int x=1;x<=3;x++)
{
for(int y=1;y<=3;y++)
{
if((x==y)||(x+y==3+1))
System.out.print("1 ");
else
System.out.print("0 ");
}
System.out.println();
}
}
}
