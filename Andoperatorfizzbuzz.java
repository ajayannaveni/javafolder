class Andoperatorfizzbuzz
{
  public static void main(String args[])
   {
	int num1=15;
	if(num1%3==0&&num1%5==0)
	 System.out.println("fizz buzz");
	else if(num1%3==0)
	 System.out.println("buzz");
	else if(num1%5==0)
	  System.out.println("fizz");
	else
	  System.out.println(num1);
    }
}
