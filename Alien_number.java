import java.util.Scanner;
class Alien_number
{
public static void main(String args[])
{
Scanner alien=new Scanner(System.in);
System.out.println("enter the number");
Alien obj=new Alien();
obj.num=alien.nextInt();
obj.method();
}
}
class Alien
{
  int num,rem=0,square=0,square1=0,rev=0,rev2=0,temp=num,temp1=square1;
public void method()
{
  square=(int)Math.pow(num,2);
 System.out.println(num+"^2="+square);
   while(num!=0)
   {
    rem=num%10;
    rev=rev*10+rem;
    num/=10;
   }
num=temp;
 System.out.println(num+"rev="+rev) ;
 square1=(int)Math.pow(rev,2);
 System.out.println(square+"^2="+square1);
 while(square1!=0)
 {
  rem=square1%10;
  rev2=rev2*10+rem;
  square1/=10;
 }

   System.out.println(temp1+"rev="+rev2) ;
 if(square==rev2)
 System.out.println("alien number");
 else
 System.out.println("not a alien number");
}
}
