public class EmpWages
{
	//CONSTANTS
	public static int isFullTime=1;
	public static int isPartTime=2;
	public static int WagePerHr=20;
  public static void main(String[] args)
  {
	  // LOCAL VARIABLES
     int DailyWage;
     int WorkingHrs=0;
	 int EmpWage=0;
	 // COMPUTATION
     double empcheck = Math.floor(Math.random() * 10) % 3;
     if(empcheck == isFullTime)
     {
       System.out.println("Employee is present");
       WorkingHrs=8;
     }
     else if (empcheck == isPartTime)
	 {
		 System.out.println("Employee is present but for PartTime");
          WorkingHrs=4;
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