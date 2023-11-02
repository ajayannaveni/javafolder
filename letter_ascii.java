class letter_ascii
{
    public static void main(String args[])
    {
        char letter='s';
	int num=letter;
         System.out.println("before conversion="+letter);
 	if(letter>='a'&&letter<='z')
 	{
	 int num1=(num-32);
  	 char alpha=(char)num1;
	System.out.println("after capital conversion and"+alpha);
        }
    	else if(letter>='A'&&letter<='Z')	
	 {
	  int num2=(num+32);
	   char alpha=(char)num2;
	  System.out.println("after small conversion and"+alpha);
	  }
	 else
	  System.out.println("not valid");
          
     }
}


   