class automatic_number
{
 public static void main(String args[])
{
  int num=76,count=0,last_digit=0,square=0,temp=num;
 square=(int)Math.pow(num,2);
  System.out.println("square="+square);
  while(num!=0)
  {
  count++;
  num/=10;
  }
 last_digit=square%(int)Math.pow(10,count);
  System.out.println("last_digit="+last_digit);
 num=temp;
 if(last_digit==num)
System.out.println("automatic number");
 else
  System.out.println("non automatic number");
}
}
