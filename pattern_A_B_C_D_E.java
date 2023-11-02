class pattern_A_B_C_D_E
{
public static void main(String args[])
{
int x,y,row=4;
char temp='A';
for(x=1;x<=row;x++)
{
for(y=1;y<=x;y++)
{
System.out.print(temp+" ");
}
temp++;

System.out.println();
}
}
}