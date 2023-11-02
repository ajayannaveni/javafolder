class month_year
{
	public static void main(String args[])
	{
	int month=2;
	int year=2024;
	if(month==1&&month==3&&month==5&&month==7&&month==8&&month==10&&month==12)
	System.out.println("31days");
	else if(month==4&&month==6&&month==9&&month==11)
	System.out.println("30days");
	else if(month==2)
	{
	   if((year%4==0&&year%100!=0)||(year%400==0))
	     System.out.println("leap year and 29 days");
	    else
	     System.out.println("it is not leap year and month days=28 ");
	}
	}
}