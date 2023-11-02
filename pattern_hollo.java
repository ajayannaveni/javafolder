class pattern_hollo
{
public static void main(String args[])
{
int x,y,row=6;
for(x=1;x<=row;x++)
{
for(y=row;y>=x;y--)
{
if(x==1||y==row||x==y)
System.out.print("* ");
else
System.out.print("  ");
}
System.out.println();
}
}
}

