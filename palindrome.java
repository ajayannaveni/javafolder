
class Evil_number
{
public static void main(String args[])
{
    int num=9,product=0,sum=0,rem=0,digit=0,temp=num;
      product=product+(int)Math.pow(num,2);
       System.out.println("product="+product);
       while(product!=0)
	{
	 rem=product%10;//1,8
          sum=sum+rem;//0+1=1,
	  product=product/10;//8
	}
	System.out.println("sum="+sum);
       if(sum==temp)
	System.out.println("evil no");
      else
	System.out.println("not evil no");
	
      
}
}
   System.out.println("----------------------------------")


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
   


  


System.out.println("-------------------------------------------------------");



class Alien_number
{
public static void main(String args[])
{
  int num=12,rem=0,square=0,square1=0,rev=0,rev2=0;
  square=(int)Math.pow(num,2);
 System.out.println("12^2="+square);
   while(num!=0)
   {
    rem=num%10;
    rev=rev*10+rem;
    num/=10;
   }
  
 System.out.println("12 rev"+rev) ;
 square1=(int)Math.pow(rev,2);
 System.out.println("21^2="+square1);
 while(square1!=0)
 {
  rem=square1%10;
  rev2=rev2*10+rem;
  square1/=10;
 }
   System.out.println("441 rev="+rev2) ;
 if(square==rev2)
 System.out.println("alien number");
 else
 System.out.println("not a alien number");
}
}


System.out.println("----------------------")
class prime_no
{
  public static void main(String args[])
{
   int num=1,end=10,sum=0,count=0;
   for(;num<end;num++)
  {
     for(int x=num;x>=num;x++)
	{
           	if(x%num==0)
		{
    		 count++;
		}

	}
    if(count==2&&num!=0)
    System.out.println(sum);
    
  }
}






System.out.println("-------------------------------------------------------");
}


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



class palindrome
{
public static void main(String args[])
{
  int num=121,rem=0,temp=num,rev=0;
   while(num!=0)
   {
     rem=num%10;
     rev=rev*10+rem;
     num=num/10;
    }
   System.out.println(rev);
    if(temp==rev)
  {
    System.out.println("palindrome");
   }   
    else
    System.out.println("not a palindrome");
}
}
 







System.out.println("-------------------------------------------------------");


