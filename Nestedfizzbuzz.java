class Nestedfizzbuzz
{
  public static void main(String args[])
   { 
	int num1=20;
	 if(num1%3==0) //15%3==0 20%3==0  16%3==0
	  {
		if(num1%5==0)
			System.out.println("fizz buzz");
		else
		        System.out.println("fizz");
	  }
	  else if(num1%5==0)
	  {
	    System.out.println("buzz");
	  }
	else
	   System.out.println(num1);
    }
}
		
	 