class pattern_triangular
{
public static void main(String args[])
{
int x,y,row=5;
for(x=1;x<=row;x++)
{
for(y=1;y<=x;y++)
{
if(x==row||y==1||x==y)
  System.out.print("* ");
else
  System.out.print("  ");
}
  System.out.println();
}



for(int i=row-1;i>=1;i--)//i=5-1;4>=1
{
for(int j=i;j>=1;j--)//j=4;4>=1,3>=1,2>=1,1>=1,0>=1.
{
if(i==j||j==1)
  System.out.print("* ");
else
  System.out.print("  ");
}
  System.out.println();
}
}
}