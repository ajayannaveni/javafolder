class pattern_triagular
{
public static void main(String args[])
{
int x,y,row=5;
for(x=1;x<=row;x++)
{
for(y=1;y<=x;y++)
{
if(y==row||x==5||x+y=6)
  System.out.print("* ");
else
  System.out.print(" ");
}
  System.out.println();

}
}
}