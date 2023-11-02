class practice_two
{
	public static void main(String args[])
	{
	 int num1=50,num2=30,num3=20,temp=0;
	 if(num1<num2)//10<30
	  {
	  temp=num1;//10
	  num1=num2;//30
	  num2=temp;//10
          }
	 if(num2<num3)//10<20
	{
	 temp=num2;//10
	 num2=num3;//20
	 num3=temp;//10
	}
	if(num3<num1)//10<30
	{
	 temp=num3;//10
	 num3=num1;//30
	 num1=temp;//10
	 }
	System.out.println("num1 value is"+num1+"num2 value is"+num2+"num3 value is"+num3);
      }
}
	