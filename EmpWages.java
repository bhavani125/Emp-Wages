public class EmpWages
{
  public static void main(String[] args)
  {
	  // CONSTANTS
     int isFullTime=1;
	 // COMPUTATION
     double empcheck = Math.floor(Math.random() * 10) % 2;
     if(empcheck == isFullTime)
     {
       System.out.println("Employee is present");
     }
     else
        System.out.println("Employee is Absent");
	 }
}