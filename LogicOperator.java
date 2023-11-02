class LogicOperator
{
	public static void main(String args[])
	{
	 int month=7;
	 if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
	   System.out.println("31 days month");
	  else if(month==4||month==6||month==9||month==11)
		System.out.println("30 days month");
	  else if(month==2)
	 	System.out.println("28 days month");
	  else
	 	System.out.println("not valid number so give valid number ");
	}
} 