public class EmpWages
{
	//CONSTANTS
	public static int isFullTime=1;
	public static int isPartTime=2;
	public static int WagePerHr=20;
	public static int DaysInMonth=20;
	public static int MaxWorkingHrs=100;
    public static void main(String[] args)
  {
	  // LOCAL VARIABLES
     int EmpWages=0;
     int WorkingHrs=0;
	 int TotalWorkingHrs=0;
	 int TotalWorkingDays=0;
	 // COMPUTATION
	  while(TotalWorkingHrs <= MaxWorkingHrs &&  TotalWorkingDays < DaysInMonth  )
     {    
      int empcheck = (int) Math.floor(Math.random() * 10) % 3;
      ++TotalWorkingDays;
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
	  TotalWorkingHrs += WorkingHrs;
     System.out.println("day#: " + TotalWorkingDays + " Emp working Hrs : " +WorkingHrs );
    }
	 EmpWages = TotalWorkingHrs * WagePerHr;
	 System.out.println("Total employee wages : " + EmpWages);
}
}