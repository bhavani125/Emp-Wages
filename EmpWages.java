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
     int empcheck = (int) Math.floor(Math.random() * 10) % 3;
     switch (empcheck)
     {
       case 1:
           System.out.println("Employee is present FullTime");
           WorkingHrs=8;
           break;
       case 2:
          System.out.println("Employee is present for PartTime");
          WorkingHrs=4;
          break;
       default:
        System.out.println("Employee is Absent");
        WorkingHrs=0;
      }
     DailyWage=WorkingHrs * WagePerHr;
     System.out.println("Daily wage of employee is " + DailyWage);
    }
}