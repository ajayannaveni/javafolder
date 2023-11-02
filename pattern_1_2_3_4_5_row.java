class pattern_1_2_3_4_5_row
{
public static void main(String args[])
{
int x,y,row=4,temp=0;
for(x=1;x<=4;x++)
{
temp=x;
for(y=1;y<=x;y++)//1<=1,2<=1.1<=2
{
System.out.print(temp+" ");
temp++;
}
System.out.println();
}
}
}