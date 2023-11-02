class Looptable
{
     public static void main(String args[])
  	{			
	   int table=2,start=1,product=1,end=10;
		System.out.println("forward table");
	    while(start<=end)
	    {
		product=table*start;
	      System.out.println(table+"x"+start+"="+product);
	       start++;
	    }
          int start1=10,end1=1,product1=1;
		System.out.println("backward table");		
          while(start1>=end1)
	   {
		product1=table*start1;
	      System.out.println(table+"x"+start1+"="+product1);
	       start1--;
           }

 	}
}