class palindromeor_not
{
public static void main(String args [])
{
  int num=11,count=0,rem=0,rev=0,temp=num;
   	while(num!=0)
	{
	 rem=num%10;
         rev=rev*10+rem;
	num/=10;
	}
	System.out.println("rev="+rev);
	if(rev==temp)
	System.out.println("palindrome");
	else
	System.out.println("not a palindrome");
}
}