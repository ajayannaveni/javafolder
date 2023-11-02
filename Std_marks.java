class Std_marks
{
	public static void main(String args[])
	{
	int telugu=89,english=76,chemistry=67,maths=78,biology=62,hindhi=60,social=85;
	int total=telugu+english+chemistry+maths+biology+social+hindhi;
	int average=(total/7); 
	if(total>=650)
	System.out.println("A GRADE"+total);
	else if(total>=550)	
	{
	System.out.println("B GRADE"+total);
	}
	else if(total>=450)
	{	
	System.out.println("C GRADE"+total);
	}
	else if(total>=350)
	{	
	System.out.println("D GRADE"+total);
	}
	else if(total>=250)	
	{
	System.out.println("E GRADE"+total);
	}
	else 
	System.out.println("FAIL"+total);
	 System.out.println("the student average is "+average);
	}
}
	