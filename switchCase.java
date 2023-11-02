class switchCase
{
	public static void main(String args[])
	{
	 char symbol='%';
	 int num=1,num1=30;
	 switch(symbol)
	        {
		  case '+':
			  System.out.println(num+"+"+num1+"="+(num+num1));
			  break;
	          case '-':
			  System.out.println(num+"-"+num1+"="+(num-num1));
			  break;
		  case '*':
			  System.out.println(num+"*"+num1+"="+(num*num1));	
			   break;
		  case '/':
			  System.out.println(num+"/"+num1+"="+(num/num1));
			   break;
		  case '%':
			  System.out.println(num+"%"+num1+"="+(num%num1));
			   break;
		  default:
			  System.out.println("invalid"); 
			
		}
		
}
}