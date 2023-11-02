class automatic_range
{
public static void main(String args[])
{
 int x=1,product=1,rem=0,temp=x,count=0,square=0,result=0;
  	for(;x<=56786;x++)
	{
	 square=(int)Math.pow(x,2);
	   count=0;
	   for(int y=1;y>0;y/=10)
	    {
	     count++;
	    }
	result=square%(int)Math.pow(10,count);
	  if(result==x)
	System.out.println(x+" "+"automatic number");
	}
}
}
	
	  