class insurance_application
{
	public static void main(String args[])
	{
	 int amount=150000;
        String bank_name="state bank of india";
	{
	   System.out.println("bank_name:"+bank_name);
	}
        int account_no=201;
	{
	   System.out.println("account_no:"+account_no);
 	}
        String person_name="A.ajay";
	{
	 System.out.println("person_name:"+person_name);
	}
	{
         System.out.println("balance_amount:"+amount);
	}
	
        if(amount>100000)
	System.out.println(" this personal eligible for credit");
	else if(amount>50000)
	{
	 System.out.println(" this personal eligible for health insurance");
	}
	else if(amount>20000)
	{
	 System.out.println("this person eligible for lic");
	}
	else 
	 System.out.println("this person not eligible for any category");
	
       }
}