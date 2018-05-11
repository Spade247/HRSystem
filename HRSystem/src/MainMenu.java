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
			System.out.println("3) logout");
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
		        num = 0;
		        new MainMenu(user,user1);
		    }
		    if(num > 18 || num == 0)
		    	System.out.println("\nPlease enter a number that has been specified:");	
		}
		while (num == 0 || num > 17);
		
		if (num == 1)
		{
			viewProfile();
		}
		if (num == 2)
		{
			applyPosition();
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
			ViewCasualWorkers();
		}
		if(num == 6 && (role.equals("Admin") || role.equals("Coordinator") ))
		{
			RequestStaff();
		}
		if(num == 7 && (role.equals("Admin") || role.equals("Coordinator") ))
		{
			RequestResources();
		}
		if(num == 8 && (role.equals("Admin") || role.equals("Coordinator") ))
		{
			ChangeStartTimes();
		}
		if(num == 9 && (role.equals("Admin") || role.equals("Coordinator") ))
		{
			AddClass();
		}
		if(num == 10 && (role.equals("Admin") || role.equals("Casual") ))
		{
			MakeRequestToChangeRole();
		}
		if(num == 11 && (role.equals("Admin") || role.equals("Approver") ))
		{
			ApproveStaffRequest();
		}
		if(num == 12 && (role.equals("Admin") || role.equals("Approver") ))
		{
			ApproveTimeStamps();
		}
		if(num == 13 && role.equals("Admin"))
		{
			SetupSemester();
		}
		if(num == 14 && role.equals("Admin") )
		{
			AssignCourse();
		}
		if(num == 15 && role.equals("Admin") )
		{
			InputTimetable();
		}
		if(num == 16 && role.equals("Admin") )
		{
			RetrieveReports();
		}
		if(num == 17 && (role.equals("Admin") || role.equals("Approver") || role.equals("Casual")|| role.equals("Coordinator")))
		{
			System.out.println("\n17) Edit Profile ");
		}
		if(num == 18 && (role.equals("Admin") || role.equals("Approver") ))
		{
			viewApprovalRequests();
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
	public void viewProfile()
	{
		
		System.out.println("**************************************************");
		System.out.printf("*%24.10s \tUser: %s\t *\n","PROFILE",user);
		System.out.printf("* %24.10s \tRole: %-11.11s*\n","SETTINGS",role);
		System.out.println("**************************************************");
		System.out.printf("Name: %-20.20s Role: %-20.20s \n",name,role);
		System.out.printf("ID: %-20.20s UserName: %-20.20s \n",ID,user);
		System.out.printf("Phone: %-20.20s Gender: %-20.20s \n",phone,gender);
		System.out.println("\n17) Edit Profile ");
		System.out.println("4) Back to Main Menu");
		
		checkSelection(num);
		
	}
	public void applyPosition()
	{
		System.out.println("**************************************************");
		System.out.printf("*  %24.10s \tUser: %s\t *\n","APPLY FOR",user);
		System.out.printf("* %24.10s \tRole: %-11.11s*\n","POSITION",role);
		System.out.println("**************************************************");
		System.out.println("4) Back to Main Menu");
		checkSelection(num);
	}
	public void logout()
	{
		System.out.println("You have successfully logged out!\n");
		new HRSystemMain().main(null);
		//System.exit(0);
	}
	public void ViewCasualWorkers()
	{
		System.out.println("**************************************************");
		System.out.printf("* %24.10s \tUser: %s\t *\n","CASUAL",user);
		System.out.printf("* %24.14s \tRole: %-11.11s*\n","WORKERS",role);
		System.out.println("**************************************************");
		System.out.println("4) Back to Main Menu");
		checkSelection(num);
	}
	public void RequestStaff()
	{
		System.out.println("**************************************************");
		System.out.printf("* %24.10s \tUser: %s\t *\n","REQUEST",user);
		System.out.printf("* %23.14s \tRole: %-11.11s*\n","STAFF",role);
		System.out.println("**************************************************");
		System.out.println("4) Back to Main Menu");
		checkSelection(num);
	}
	public void RequestResources()
	{
		System.out.println("**************************************************");
		System.out.printf("* %24.10s \tUser: %s\t *\n","REQUEST",user);
		System.out.printf("* %25.14s \tRole: %-11.11s*\n","RESOURCES",role);
		System.out.println("**************************************************");
		System.out.println("4) Back to Main Menu");
		checkSelection(num);
	}
	public void ChangeStartTimes()
	{
		System.out.println("**************************************************");
		System.out.printf("* %24.10s \tUser: %s\t *\n","START",user);
		System.out.printf("* %24.14s \tRole: %-11.11s*\n","TIMES",role);
		System.out.println("**************************************************");
		System.out.println("4) Back to Main Menu");
		checkSelection(num);
	}
	public void AddClass()
	{
		System.out.println("**************************************************");
		System.out.printf("* %24.10s \tUser: %s\t *\n","ADD",user);
		System.out.printf("* %26.10s \tRole: %-11.11s*\n","CLASSES",role);
		System.out.println("**************************************************");
		System.out.println("4) Back to Main Menu");
		checkSelection(num);
	}
	public void MakeRequestToChangeRole()
	{
		System.out.println("**************************************************");
		System.out.printf("* %24.10s \tUser: %s\t *\n","CHANGE",user);
		System.out.printf("* %23.14s \tRole: %-11.11s*\n","ROLE",role);
		System.out.println("**************************************************");
		System.out.println("4) Back to Main Menu");
		checkSelection(num);
	}
	public void ApproveStaffRequest()
	{
		System.out.println("**************************************************");
		System.out.printf("* %24.10s \tUser: %s\t *\n","APPROVE",user);
		System.out.printf("* %26.14s \tRole: %-11.11s*\n","STAFF REQUESTS",role);
		System.out.println("**************************************************");
		System.out.println("4) Back to Main Menu");
		checkSelection(num);
		
	}
	public void ApproveTimeStamps()
	{
		System.out.println("**************************************************");
		System.out.printf("* %24.10s \tUser: %s\t *\n","APPROVE",user);
		System.out.printf("* %26.14s \tRole: %-11.11s*\n","TIME STAMPS",role);
		System.out.println("**************************************************");
		System.out.println("4) Back to Main Menu");
		checkSelection(num);
	}
	public void SetupSemester()
	{
		System.out.println("**************************************************");
		System.out.printf("* %24.10s \tUser: %s\t *\n","SETUP",user);
		System.out.printf("* %26.14s \tRole: %-11.11s*\n","SEMESTER",role);
		System.out.println("**************************************************");
		System.out.println("4) Back to Main Menu");
		checkSelection(num);
	}
	public void setupSemester()
	{
		System.out.println("**************************************************");
		System.out.printf("* %24.10s \tUser: %s\t *\n","SETUP",user);
		System.out.printf("* %24.10s \tRole: %-11.11s*\n","SEMESTER",role);
		System.out.println("**************************************************");
		System.out.println("4) Back to Main Menu");
		checkSelection(num);
	}
	public void AssignCourse()
	{
		System.out.println("**************************************************");
		System.out.printf("* %24.10s \tUser: %s\t *\n","ASSIGN",user);
		System.out.printf("* %24.14s \tRole: %-11.11s*\n","COURSE",role);
		System.out.println("**************************************************");
		System.out.println("4) Back to Main Menu");
		checkSelection(num);
	}
	public void InputTimetable()
	{
		System.out.println("**************************************************");
		System.out.printf("* %24.10s \tUser: %s\t *\n","INPUT",user);
		System.out.printf("* %26.14s \tRole: %-11.11s*\n","TIMETABLE",role);
		System.out.println("**************************************************");
		System.out.println("4) Back to Main Menu");
		checkSelection(num);
	}
	public void RetrieveReports()
	{
		System.out.println("**************************************************");
		System.out.printf("* %24.10s \tUser: %s\t *\n","GENERAL",user);
		System.out.printf("* %24.14s \tRole: %-11.11s*\n","REPORTS",role);
		System.out.println("**************************************************");
		System.out.println("4) Back to Main Menu");
		checkSelection(num);
	}
	public void viewApprovalRequests()
	{
		System.out.println("**************************************************");
		System.out.printf("* %24.10s \tUser: %s\t *\n","VIEW",user);
		System.out.printf("* %26.14s \tRole: %-11.11s*\n","ALL REQUESTS",role);
		System.out.println("**************************************************");
		System.out.println("4) Back to Main Menu");
		checkSelection(num);
	}
}
