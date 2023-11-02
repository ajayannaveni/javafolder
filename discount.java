class discount
{
	 public static void main(String args[])
	{
	 String product_name="laptop";
   	 String product_code="A1j1";
  	 char product_id='a';
   	 double actual_price=47000.25;
   	 double selling_price=45000.25;
   	 int product_quantity=1;
  	 double total_cost=(selling_price*product_quantity);
         if(total_cost>=45000)
	 {
           double discount=(10.0/100)*total_cost;
	   System.out.println(discount);
           double final_cost=discount-total_cost;
   	   System.out.println("this product ok i can buy it");
         }
         
         else
	 {
   	   System.out.println("this product not ok i can't buy it");  
	 } 
         {   
 	  System.out.println( "product name:"+product_name);
   	  System.out.println( "product code:"+product_code);
    	  System.out.println( "product id:"+product_id);
       	  System.out.println( "product_actual_price:"+actual_price);
   	  System.out.println( "product selling price:"+selling_price);
   	  System.out.println( "product quantity:"+product_quantity);
   	  System.out.println("total cost:"+total_cost);
   	  //System.out.println("discount:"+discount);
         }
  
}
}


//(total_cost*10)/100





































