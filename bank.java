class bank
{
  public static void main(String args[])
 {
  String bank_name="state bank of india";
  int account_no=201;
  String person_name="A.ajay";
  int balance_amount=100000;
  int balance_withdraw=10000;
  System.out.println("bank_name:"+bank_name);
  System.out.println("account_no:"+account_no);
  System.out.println("person_name:"+person_name);
  System.out.println("balance_amount:"+balance_amount);
  System.out.println("balance_withdraw:"+balance_withdraw);
  System.out.println("remaining balance:"+(balance_amount-balance_withdraw));
 }
}
