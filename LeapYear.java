class LeapYear
{
	public static void main(String args[])
	{
	 int year=2001;
	 if((year%4==0&&year%100!=100)||year%400==0)
	System.out.println("leap year");
	else
	 System.out.println("This year"+year+"not a leap year");
	}
}