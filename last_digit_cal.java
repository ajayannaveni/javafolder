class last_digit_cal
{
	public static void main(String args[])
	{
	int num1=366;
	int last_digit=num1%10;
	if(last_digit%2==0)
	 System.out.println("this is even");
	 else if(last_digit%2==1)
	 {
	   System.out.println("this is odd");
	  }
	  if(last_digit<0)
	  {
	    System.out.println("this number is negative"+last_digit);
	  }
	  else
	  {
	    System.out.println("this number is positive and "+" the positive value is "+last_digit);
	  }
	 }
}


	