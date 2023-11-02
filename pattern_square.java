class pattern_square
{
public static void main(String args[])
{
int x,y,row=4;
for(x=1;x<=row;x++)//1<=4.x=2,2<=4.3<=4.4<=4
{
for(y=x;y>=1;y--)//1>=1,0>=1.2>=1,1>=1,0>=1.3>=1,2>=1,1>=1,0>=1.4>=1,3>=1,2>=1,1>=1,0>=1.
{
if(y==row&&x==row)//y===4,x===4
{
System.out.print(0+" ");
}
else
System.out.print(y*y+" ");
}
System.out.println();
}
}
}