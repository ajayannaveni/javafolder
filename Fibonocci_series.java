class Fibonocci_series
{
public static void main(String args[])
{
	int a=0,b=1,c=0;
	System.out.print(a+" "+" "+b+" ");
	for(int x=1;x<=10;x++)//x=0 in case it loop rotate 11 times
	{
	 c=a+b;
	 a=b;
	 b=c;
	System.out.print(c+" ");
	}
	
	
}
}
