class typingcasting2
{
  public static void main(String args[])
 {
  int x=10;
  double y=10;
  int z=(int)10.567;
  long num1=10000000003l;
  float num2=99999999f;
  double num3=100;
           //error loss of conversion int num2=200.25so;
  int num4=(int)200.25;
  int num5=(int)348.780;
  short num6=100;
  byte num7=(byte)num5;
 
   System.out.println(x+"and"+y+"and"+z);
   System.out.println(num1+"and"+num2);
   System.out.println(num3+"and"+num4+"and"+num5);

   System.out.println("short value is"+num6+"and byte value is"+num7);
 }
}


 

