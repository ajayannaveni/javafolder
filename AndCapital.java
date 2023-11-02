class AndCapital
{
  public static void main(String args[])
  {
	char num='A';
   if(num>='A'&&num<='z')
     System.out.println("CAPITAL");
    else if(num>='a'&&num<='z')
     System.out.println("small");
   else if(num>='0'&&num<='9')
	System.out.println("numbers");
    else 
	System.out.println("symbol");
   }
}