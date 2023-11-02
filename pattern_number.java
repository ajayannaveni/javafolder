class pattern_number
{
public static void main(String args[])
{
int x,y,row=5,temp=0;
for(x=row;x>=1;x--)
{
temp=5;
for(y=x;y>=1;y--)
{
System.out.print(temp+" ");
temp--;
}
System.out.println();
}
}
}
