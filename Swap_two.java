class Swap_two
 {
	public static void main(String args[])
	{
 	 int a=10,b=20,c=30,temp=0;
	 if(a<b)
	 {
	  temp=a;//10
	  a=b;//20
	  b=temp;//10
	 }
	 if(a<c)//20<30
	 {
	 temp=a;//20
	 a=c;//30
	 c=temp;//20
	 }
         if(b<c)//10<20
	 {
	 temp=b;//10
	 b=c;//20
	 c=temp;//10
         }
        System.out.println("a"+a+"b"+b+"c"+c);
        }
  }
	