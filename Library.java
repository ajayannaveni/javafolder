class Library
{
	public static void main(String args[])
	{
	int day=4;//30
	double fine=0.5;
	if(day>=40) 
	{  
	   int free=4;
	  double num1=((day-free)*0.5);

	  System.out.println(" your more than 40 days so your library membership cancelled "+ num1+"rupees");
	}
        else if(day>=30)
	{ 
	  int free=4;
	  double num2=((day-free)*0.5);
	 System.out.println("your more than 30days so you can pay"+num2+"rupees");
	}
	else if(day>=10)
	{
	  int free=4;
	 double num3=((day-free)*0.5);
	 System.out.println("your more than 10days so you can pay"+num3+"rupees");
	}
	else if(day>5) 
	{  
	  int free=4;
	double num4=((day-free)*0.5);
	 System.out.println(" your more than 5days so you can pay"+num4+"paisa");
	}
	 else
	{
		System.out.println(" your no pay money");

	}
	}
}
	

	