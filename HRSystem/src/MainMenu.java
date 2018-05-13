import java.util.*;
public class MainMenu {
	private String user = "-----";
	private String role = "-----";
	private String name = "";
	private String ID = "";
	private String phone = "";
	private char gender ;
	String userName= "";
	User user1;
	private Scanner scan = new Scanner(System.in);
	private int num = 0;
	
	public MainMenu()
	{	
		System.out.println("*************************************************");
		System.out.println("*                MAIN MENU      User: "+user+"     *");
		System.out.println("*                               Role: "+role+"     *");
		System.out.println("*************************************************");
		System.out.println("*************************************************");
		System.out.printf("* %23.10s \t%s\t\t*\n","LOGIN",user);
		System.out.printf("* %22.10s \t\t\t*\n","PAGE");
		System.out.println("*************************************************");
	}
	public MainMenu(String name,User user1)
	{	
		this.user1=user1;
		addUserID(name);
		addUserRole(user1.getRole());
		this.name = user1.getName();
		this.ID = user1.getID();
		this.phone = user1.getPhone();
		this.gender =user1.getGender();
		this.userName= user1.getUserName();
		this.name = user1.getName();
		menuSelection(user);
		
	}
	public void menuSelection(String user)
	{
		if(role.equals("Admin"))
		{
			setMenu(user,role);
			System.out.println("1) View Profile");
			System.out.println("2) Apply for Position");
			System.out.println("3) Logout");
			System.out.println("5) View Casual Workers");
			System.out.println("6) Request Staff");
			System.out.println("7) Request Resources");
			System.out.println("8) Change Start Time For Classes");
			System.out.println("9) Add Class");
			System.out.println("10) Make Request to Change Role ");
			System.out.println("11) Approve Staff Requests");
			System.out.println("12) Approve Time Stamps ");
			System.out.println("13) Setup Semester");
			System.out.println("14) Assign Course ");
			System.out.println("15) Input Timetable ");
			System.out.println("16) Retreive Reports ");
			System.out.println("0) Exit System");
		
			
			checkSelection(num);
			
			
		}
		else if (role.equals("Coordinator"))
		{
			setMenu(user,role);
			System.out.println("1) View Profile");
			System.out.println("2) Apply for Position");
			System.out.println("3) logout");
			System.out.println("5) View Casual Workers");
			System.out.println("6) Request Staff");
			System.out.println("7) Request Resources");
			System.out.println("8) Change Start Time For Classes");
			System.out.println("9) Add Class");
			System.out.println("0) Exit System");
			
			//System.out.println("\nPlease enter a number for your selection:");
			checkSelection(num);
		}
		else if (role.equals("Casual"))
		{
			setMenu(user,role);
			System.out.println("1) View Profile");
			System.out.println("2) Apply for Position");
			System.out.println("3) Logout");
			System.out.println("10) Make Request to Change Role ");
			System.out.println("0) Exit System");
			
			checkSelection(num);
		}
		else if (role.equals("Approver"))
		{
			setMenu(user,role);
			System.out.println("1) View Profile");
			System.out.println("2) Apply for Position");
			System.out.println("3) Logout");
			System.out.println("11) Approve Staff Requests");
			System.out.println("12) Approve Time Stamps ");
			System.out.println("17) View All Pending Requests");
			System.out.println("0) Exit System");

			
			checkSelection(num);
		}
	}
	public void setMenu(String user, String role)
	{
		System.out.println("**************************************************");
		System.out.printf("* %24.10s \tUser: %s\t *\n","MAIN MENU",user);
		System.out.printf("*  \t\t\t\tRole: %-11.11s*\n",role);
		System.out.println("**************************************************");
	}
	public void setUser(User us)
	{
		user1=us;
	}
	public void checkSelection(int num)
	{
		System.out.println("\nPlease enter a number for your selection:");
		do
		{
		    try
		    {
		        num = scan.nextInt();
		    }
		    catch (InputMismatchException exception)
		    {
		        System.out.println("Integers only, please!.\n");
		        num =0;
		        new MainMenu(user,user1);
		    }
		    if(num > 18 || num < 0)
		    	System.out.println("\nPlease enter a number that has been specified:");	
		}
		while (num < 0 || num > 18);
		if(num == 0)
		{
			exitSystem();
		}
		if (num == 1)
		{
			user1.viewProfile(user,role);
			checkSelection(num);
		}
		if (num == 2)
		{
			user1.applyPosition(user,role);
			checkSelection(num);
		}
		
		if (num == 3)
		{
			logout();
		}
		if (num == 4 )
		{
			new MainMenu(this.user,this.user1);
		}
		if(num == 5 && (role.equals("Admin") || role.equals("Coordinator") ))
		{
			user1.ViewCasualWorkers(user,role);
			checkSelection(num);
		}
		if(num == 6 && (role.equals("Admin") || role.equals("Coordinator") ))
		{
			user1.RequestStaff(user,role);
			checkSelection(num);
		}
		if(num == 7 && (role.equals("Admin") || role.equals("Coordinator") ))
		{
			user1.RequestResources(user,role);
			checkSelection(num);
		}
		if(num == 8 && (role.equals("Admin") || role.equals("Coordinator") ))
		{
			user1.ChangeStartTimes(user,role);
			checkSelection(num);
		}
		if(num == 9 && (role.equals("Admin") || role.equals("Coordinator") ))
		{
			user1.AddClass(user,role);
			checkSelection(num);
		}
		if(num == 10 && (role.equals("Admin") || role.equals("Casual") ))
		{
			user1.MakeRequestToChangeRole(user,role);
			checkSelection(num);
		}
		if(num == 11 && (role.equals("Admin") || role.equals("Approver") ))
		{
			user1.ApproveStaffRequest(user,role);
			checkSelection(num);
		}
		if(num == 12 && (role.equals("Admin") || role.equals("Approver") ))
		{
			user1.ApproveTimeStamps(user,role);
			checkSelection(num);
		}
		if(num == 13 && role.equals("Admin"))
		{
			user1.SetupSemester(user,role);
			checkSelection(num);
		}
		if(num == 14 && role.equals("Admin") )
		{
			user1.AssignCourse(user,role);
			checkSelection(num);
		}
		if(num == 15 && role.equals("Admin") )
		{
			user1.InputTimetable(user,role);
			checkSelection(num);
		}
		if(num == 16 && role.equals("Admin") )
		{
			user1.RetrieveReports(user,role);
			checkSelection(num);
		}
		if(num == 17 && (role.equals("Admin") || role.equals("Approver") || role.equals("Casual")|| role.equals("Coordinator")))
		{
			user1.EditProfile(user,role);
			checkSelection(num);
		}
		if(num == 18 && (role.equals("Admin") || role.equals("Approver") ))
		{
			user1.viewApprovalRequests(user,role);
			checkSelection(num);
		}
		else
		{
			System.out.println("\nYOU DO NOT HAVE ACCESS TO PERFORM THIS TASK\n");
			new MainMenu(this.user,this.user1);
		}
		
		
	}
	public void addUserID(String name)
	{
		user=name;
	}
	public void addUserRole(String role)
	{
		this.role=role;
	}
	public void logout()
	{
		System.out.println("You have successfully logged out!\n");
		new HRSystemMain().main(null);
		//System.exit(0);
	}
	public void exitSystem()
	{
		System.out.println("\n\t***SYSTEM EXITED!***");
		System.out.println("Thank You for using the RMIT HR System");
		System.exit(0);
		
	}
	
}
