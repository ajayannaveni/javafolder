class patterneven
{
public static void main(String args[])
{
int row=5,col=5;
for(int x=1;x<=row;x++)
{
for(int y=1;y<=col;y++)
{
 if(x%2==0)
System.out.print("# ");
else
System.out.print("& ");
}
System.out.println("");
}
}
}