class triangular_space
{
public static void main(String args[])
{
int x,y,row=5;
for(x=1;x<=row;x++)
{
for(y=1;y<=x;y++)
{
if(x==y||y==1)
  System.out.print("* ");
else
  System.out.print(" ");
}
  System.out.println();
}
}
}



