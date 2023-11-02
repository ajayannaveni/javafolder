class sum
{
public static void main(String args[])
 {
   int num=132,sum=0,product=0,rem=0;
   
   while(num!=0)
{
      rem=num%10;
      digit=rem;
      num=num/10;
    }
    sum=digit+sum;
   product=product*digit;
   System.out.println(sum+" "+product);
}
}
