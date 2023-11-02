class Loopfactorial
{
public static void main(String args[])
 {
  int start=1,factorial=1;
  while(start<=5)
  {
  factorial=factorial*start;
   start++;
   }
	System.out.println("factorial of"+start+"is"+factorial);
  }
}