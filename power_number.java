class power_number
{
public static void main(String args[])
{
  int num=132,sum=0,rem=0,product=1;
  while(num!=0)
  {
   rem=num%10;
   sum+=rem;
   product*=rem;
   num/=10;
   }
  System.out.println("sum="+sum+"product="+product);
  if(sum==product)
     System.out.println("power number");
  else
      System.out.println("power number");
}
}
   

