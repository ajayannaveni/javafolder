class InsuranceCompany
{
 	public static void main(String args[])
 	{
	 int age=25;
	 String gender="male";
	 String health="excellent";
	 String living_place="city";
	 int policy_amount=200000;		
	 if(age>=25&&age<=35)
	 {
		if(health=="excellent"&&living_place=="city")
		{
		   if(gender=="male"&&policy_amount>=200000)
		      System.out.println("premium is rs.4per thousand:"+policy_amount/1000*4);
                   else if(gender=="female"&&policy_amount>=100000)
			System.out.println("premium is rs.3per thousand:"+policy_amount/1000*3);
		}
	   else if(policy_amount>=10000)
		{	
		   if(health=="poor"&&living_place=="village")
		     if(gender=="male")
		    System.out.println("premium is rs.6per thousand:"+policy_amount/1000*6);
		}	 	
	 
	 }
		else
		System.out.println("this person is not insured");	
	}
}
	



