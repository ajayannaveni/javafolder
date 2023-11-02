class disease
{
	public static void main(String args[])
	{
	int age=16;
	String disease="cold";
	if(age>80|| disease=="typhoid")
		System.out.println("paracetmol");
	else if(disease=="covid")
	{
	  if(age>25)
		System.out.println("vaccination");
	  else
		System.out.println("no vaccination");
	}
	else if(disease=="cold")
	{
		if(age>10)
		 System.out.println("dolo 650");
		else
		 System.out.println("syrup");
	}
}
}
		
		
	    
		