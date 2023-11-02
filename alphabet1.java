class pattern_alphabet1
{
public static void main(String args[])
{
int x,y,row=5;
char temp='A';
for(x=row;x>=1;x--)
{
for(y=x;y>=1;y--)
{
System.out.print((char)temp+" ");
temp++;
}
System.out.println();
}
}
}
