class prime_number1
{
java.util.package,
public static void main(String args[])
{
 Scanner aj=new Scanner(System.in);
   int a=aj.nextInt();
      int count=0;
	for(int x=1;x<=100;x++)
	{
 	   count=0;
	  for(int y=1;y<=x;y++)
	  {
	    if(x%y==0)
		{
		  count++;
		}
	  }
	if(count==2)
        System.out.println(x);
       }
}
}