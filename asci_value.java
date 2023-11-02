class ascii_value
{
  public static void main(String  args[])
  { 
    char letter='z';
   int capital=(int)letter;
   if(capital>=65&&capital<=90)
	System.out.println("capital letter and ascii value"+capital);
   else if(capital>=97&&capital<=122)
	System.out.println("small letter and ascii value"+capital);
  else	
	System.out.println("alphabet");
   }
}
	