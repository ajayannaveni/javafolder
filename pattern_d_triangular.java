class pattern_d_triangular
{
public static void main(String args[])
{
int x,y,row=4;
for(x=1;x<=row;x++)
{
   for(y=1;y<=x;y++)
   {
	System.out.print("* ");
   }
System.out.println();
}
for(int i=row-1;i<=5;i++)//i=3;3<=4.4<=5.5<=5
{
	for(int j=i;j<=5 ;j++)//j=3;3<=5,4<=5,5<=5.j=4;4<=5,5<=5.j=5;5<=5.
	{
	     System.out.print("* ");
	}
 System.out.println();
}
}
} 



//another type:
/*for(int i=row-1;i>=1;i--)//i=3;3>=1
{
	for(int j=i;j>=1;j--)j=3,3>=1,2>=1,1>=1,0>=1
	{
	     System.out.print("* ");
	}
 System.out.println();
}
}
} */