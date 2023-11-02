class pattern_triangular_space
{
public static void main(String args[])
{
int x,y,row=10;
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
for(int i=row-1;i>=1;i--)
{
for(int j=i;j>=1;j--)
{
if(i==j||j==1)
  System.out.print("* ");
else
  System.out.print(" ");
}
  System.out.println();
}
}
}



