public class EmpWages
{
	//CONSTANTS
	public static int isFullTime=1;
	public static int WagePerHr=20;
  public static void main(String[] args)
  {
	  // LOCAL VARIABLES
     int DailyWage;
     int WorkingHrs=0;
	 // COMPUTATION
     double empcheck = Math.floor(Math.random() * 10) % 2;
     if(empcheck == isFullTime)
     {
       System.out.println("Employee is present");
       WorkingHrs=8;
     }
     else
      {
        System.out.println("Employee is Absent");
        WorkingHrs=0;
      }
     DailyWage=WorkingHrs * WagePerHr;
     System.out.println("Daily wage of employee is " + DailyWage);
    }
}