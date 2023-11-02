class palindrome111
{
  public static void main(String args[])
{
   int x=1, rev=0,rem=0;
        for(;x<=100;x++)
	{
 	 rev=0;
	  for(int y=x;y>0;y/=10)
	  {
	  
		rem=y%10;
	        rev=rev*10+rem;
	  
	 }
	if(x==rev)
	 System.out.println(rev);
	}
	
}
}
	
	
