class pattern_alphabet1
{
public static void main(String args[])
{
int x,y,row=5,temp=0;
for(x=row;x>=1;x--)
{
temp='A';
for(y=x;y>=1;y--)
{
System.out.print((char)temp+" ");
temp++;
}
System.out.println();
}
}
}
