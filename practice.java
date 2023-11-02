class  practice
{
 	public static void main(String args[])
	{

 	int num1=10,num2=30,num3=20;
	 System.out.println("before num1 value is "+num1+"num2 value is "+num2+"num3 value is "+num3);
 	if(num1>num2)
	{
	 num1=num1+num2;
	 num2=num1-num2;
	 num1=num1-num2;
        }
	if(num2>num3)
	{
	  num2=num2+num3;
	  num3=num2-num3;
	  num2=num2-num3;
	}
	if(num3>num1)
	 {
	 num3=num3+num1;
	 num1=num3-num1;
	 num3=num3-num1;
	 }
	System.out.println("num1 value is "+num1+"num2 value is "+num2+"num3 value is "+num3);
  	}	  
}
