class pattern_diagnal
{
public static void main(String args[])
{
for(int x=1;x<=4;x++)
{
for(int y=1;y<=4;y++)
{
if(x==y)
System.out.print("# ");
else
System.out.print("* ");
}
System.out.println();
}
}
}