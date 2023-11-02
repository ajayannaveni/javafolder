class employee
{
public static void main(String args[])
 {
      String employee_name="ajay";
      char employee_id='a';
      String employee_designation="developer";
      String employee_department="developer";
      int total_no_of_workingdays=30;
      int total_no_of_present=25;
      int total_no_of_absent=5;
      double salary_day_wise=2000;
    System.out.println("employee name:"+employee_name);
    System.out.println("employee id:"+employee_id);
    System.out.println("employee designation:"+employee_designation);
    System.out.println("employee department:"+employee_department);
    System.out.println("employee total no.of workingdays:"+total_no_of_workingdays);
    System.out.println("employee total no.of present:"+total_no_of_present);
    System.out.println("employee total no.of absent:"+total_no_of_absent);
    System.out.println("employee salary day wise:"+salary_day_wise);
    System.out.println("employee actual salary:"+ total_no_of_workingdays*salary_day_wise);
    System.out.println("employee salary credited:"+total_no_of_present*salary_day_wise);
  }
} 

