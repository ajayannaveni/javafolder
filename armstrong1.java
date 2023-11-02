class armstrong1
{
public static void main(String args[])
{
  int num=1634,count=0,rem=0,temp=num,result=0;
   while(num!=0)
 {
   count++;
  num/=10;
}
  num=temp;
   while(num!=0)
   {
    rem=num%10;
    num/=10;  
  result=result+(int)Math.pow(rem,count);
}
System.out.println("result="+result);
if(result==temp)
System.out.println("armstrong");
else
System.out.println("not a armstrong");
}
}

