class product
{
  public static void main(String args[])
  {
   String product_name="mobile";
   String product_code="A1j1";
   char product_id='a';
   double actual_price=20000.25;
   double selling_price=19000.25;
   int product_quantity=2;
   double total_cost=(selling_price*product_quantity);
   double discount=(10.0/100)*total_cost;
  double total_payble=(total_cost-discount);

   System.out.println( "product name:"+product_name);
   System.out.println( "product code:"+product_code);
   System.out.println( "product id:"+product_id);
   System.out.println( "product_actual_price:"+actual_price);
   System.out.println( "product selling price:"+selling_price);
   System.out.println( "product quantity:"+product_quantity);
   System.out.println("total cost:"+total_cost);
   System.out.println("discount:"+discount);
   System.out.println("total payble:"+total_payble);
  }
}