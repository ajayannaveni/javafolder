class swapping
{
 public static void main(String args[])
 {
     int num1=10;
     int num2=20;
     int temp=0;
    System.out.println("before swapping");
    System.out.println(num1);
    System.out.println(num2);

    temp=num1;//temp=10
    num1=num2;//num1=20
    num2=temp;//num2=10
    System.out.println("after swapping");
    System.out.println(num1);
    System.out.println(num2);
  } 

}