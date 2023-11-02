class Swap
{
	public static void main(String args[])
	{
	 int a=20,b=10,c=30;
         if(a<b)//20<10
          {
	    a=a+b;
	    b=a-b;
	    a=a-b;	    
          }
         if(a<c)//20<30
	  {
 	   a=a+c;//50
 	   c=a-c;//20
 	   a=a-c;//30
         }
	  if(b<c)//10<20
	  {
          b=b+c;//30
	  c=b-c;//10
	  b=b-c;//20
          }
     System.out.println("a"+a+"b"+b+"c"+c);
        
 }
}