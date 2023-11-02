class Technology
{
  public static void main(String args[])
  {
   int num=2025,temp=num,firsthalf=0,secondhalf=0,sum=0,count=0,square=0;
   while(num!=0)
  {
    count++;
    num/=10;
  }
	num=temp;
	if(count%2==0)// always even digit form in technology 4%2==0;
	{
	firsthalf=num%(int)Math.pow(10,count/2);
	secondhalf=num/(int)Math.pow(10,count/2);
	}
    sum=firsthalf+secondhalf;
    square=(int)Math.pow(sum,2);
    if(num==square)
    System.out.println("technology");
    else
     System.out.println("no technology");
}
}

