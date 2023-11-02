class  HospitalSwitch_case
{
  public static void main(String args[])
 { 
	String disease="typhoid";
	 int age=22;
	 int sugar=280;
	 switch(disease)
	    {
	     case "diarehea":
				 if(age>0&&age<=15)
                               	    System.out.println("his/her medication at home");
				  else if(age>16&&age>=60)
				    System.out.println("he need to undergo  blood test as well as full body scanning");
				   else
				    System.out.println("then he need to admitted in icu and undergo blood test as well as full body scanning");
				   break;	
	    case "typhoid":
				 
				 if(age>0&&age<=15)
                               	    System.out.println("he need to visit hospital for daily check ups");
				  else if(age>16&&age>=60)
				    System.out.println("he need to undergo urine test and admitted in the general ward");
				   else
				    System.out.println("he need to admitted in icu and undergo bone marrow test");
				   break;
            case "diabetes":
				 
				 if(sugar>=300)
                               	    System.out.println("should need to have insuliin and undergo urine test and blood test and check the sugar level");                                                                                     
				   else
				    System.out.println(" this person have pills");
				  break;
		default:      System.out.println("this person is al right");				    
	    }		 
}
}