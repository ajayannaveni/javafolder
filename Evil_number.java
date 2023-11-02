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
