class swapping2
{
  public static void main(String args[])
  {
    
     int num1=10;
     int num2=20;
    num1=num1+num2;// num1=30
    num2=num1-num2;//num2=10
    num1=num1-num2;//num1=20 without variable use swapping
    System.out.println("after swapping without variable");
    System.out.println(num1);
    System.out.println(num2);
  }
}