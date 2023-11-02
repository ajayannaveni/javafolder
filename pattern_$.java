class pattern_$
{
public static void main(String args[])
{
int x,y,row=6;
for(x=1;x<=row;x++)
{
for(y=1;y<=x;y++)
{
if(y==1||x==row||x==y)
System.out.print("# ");
else
System.out.print("$ ");
}
System.out.println();
}
}
}

