class Sap

{
	public static void main(String args[])
	{
	 int num1=100,num2=1,num3=5,temp=0;

	 if(num1>num2)
	{
	  temp=num1;//100
	  num1=num2;//1
	  num2=temp;//100
	}
	 if(num1>num3)
	{
	  temp=num1;//1
	  num1=num3;//5
	  num3=temp;//1
	}
	if(num2>num3)
	{
 	 temp=num2;//100
	  num2=num3;//1
          num3=temp; //100
        }
	System.out.println("num1 value is"+num1+"num2 value is"+num2+"num3 value is"+num3);
      }
	 
}    