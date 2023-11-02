class technology_range
{
public static void main(String args[])
{
int x=1,count=0,square=0;
    for(;x<100000;x++)
    {
	int y=x,firsthalf=0,secondhalf=0,sum=0;count=0;
	 for(;y>0;y/=10)
	   {
	     count++;
	    }
	 y=x;
	if(count%2==0)
	{
	 firsthalf=y%(int)Math.pow(10,count/2);
	 secondhalf=y/(int)Math.pow(10,count/2);
	}
	sum=firsthalf+secondhalf;
	 square=(int)Math.pow(sum,2);   
	if(square==x)
	System.out.println(x+" "+"technology number");
    }
}
}