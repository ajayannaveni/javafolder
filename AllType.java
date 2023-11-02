class AllType
{
	public static void main(String args[])
	{
	char letter='$';
	if(letter>='a'&&letter<='z')
	{
	     if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u') 
		
			System.out.println("small case vowel");
		
		else
		
		System.out.println("small case consonant");	
	        
	}
	else if(letter>='A'&&letter<='Z')
	{
	     if(letter=='A'||letter=='E'||letter=='I'||letter=='O'||letter=='U')
		
			System.out.println("CAPITAL CASE VOWEL");
		
		else	
		
		System.out.println("CAPITAL CASE CONSONANT");	
		
	}
	 else if(letter>='0'&&letter<='9')	
	  {
	  System.out.println("numbers");
	  }
	 else
	   System.out.println("symbols");
	}
}
		
	
		
		