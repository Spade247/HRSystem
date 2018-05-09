import java.util.*;
public class MainMenu {
	private String user = "-----";
	private String role = "-----";
	private Scanner scan = new Scanner(System.in);
	private int num = 0;
	public MainMenu()
	{	
		System.out.println("*************************************************");
		System.out.println("*                MAIN MENU      User: "+user+"     *");
		System.out.println("*                               Role: "+role+"     *");
		System.out.println("*************************************************");
	}
	public MainMenu(String name,String role)
	{	
		addUserID(name);
		addUserRole(role);
		if(user.equals("Admin"))
		{
			System.out.println("*************************************************");
			System.out.println("*                MAIN MENU      User: "+user+"     *");
			System.out.println("*                               Role: "+role+"     *");
			System.out.println("*************************************************");
			System.out.println("1) View Profile");
			System.out.println("2) Apply for Position");
			System.out.println("3) logout");
			System.out.println("\nPlease enter a number for your selection:");
			checkSelection(num);
			
			
		}
		else if (user.equals("COD"))
		{
			System.out.println("*************************************************");
			System.out.println("*                MAIN MENU      User: "+user+"     *");
			System.out.println("*                               Role: "+role+"     *");
			System.out.println("*************************************************");
			System.out.println("1) View Profile");
			System.out.println("2) Apply for Position");
			System.out.println("3) Logout");
			System.out.println("\nPlease enter a number for your selection:");
			checkSelection(num);
		}
		else if (user.equals("CAS"))
		{
			System.out.println("*************************************************");
			System.out.println("*                MAIN MENU      User: "+user+"     *");
			System.out.println("*                               Role: "+role+"     *");
			System.out.println("*************************************************");
			System.out.println("1) View Profile");
			System.out.println("2) Apply for Position");
			System.out.println("3) Logout");
			System.out.println("\nPlease enter a number for your selection:");
			checkSelection(num);
		}
		else if (user.equals("APP"))
		{
			System.out.println("*************************************************");
			System.out.println("*                MAIN MENU      User: "+user+"     *");
			System.out.println("*                               Role: "+role+"     *");
			System.out.println("*************************************************");
			System.out.println("1) View Profile");
			System.out.println("2) Apply for Position");
			System.out.println("3) Logout");
			System.out.println("\nPlease enter a number for your selection:");
			checkSelection(num);
		}
	}
	public void checkSelection(int num)
	{
		do
		{
		    try
		    {
		        num = scan.nextInt();
		    }
		    catch (InputMismatchException exception)
		    {
		        System.out.println("Integers only, please.");
		        num = 0;
		        break;
		    }
		    if(num > 4 || num == 0)
		    	System.out.println("\nPlease enter a number that has been specified:");	
		}
		while (num == 0 || num > 4);
		
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
		if (num == 4)
		{
			new MainMenu(this.user,this.role);
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
		
		System.out.println("*************************************************");
		System.out.println("*                PROFILE       User: "+user+"     *");
		System.out.println("*                SETTINGS      Role: "+role+"     *");
		System.out.println("*************************************************");
		System.out.println("4) Back to Main Menu");
		checkSelection(num);
		
	}
	public void applyPosition()
	{
		System.out.println("*************************************************");
		System.out.println("*                APPLY FOR       User: "+user+"     *");
		System.out.println("*                POSITION        Role: "+role+"     *");
		System.out.println("*************************************************");
		System.out.println("4) Back to Main Menu");
		checkSelection(num);
	}
	public void setupSemester()
	{
		System.out.println("*************************************************");
		System.out.println("*                 SETUP         User: "+user+"     *");
		System.out.println("*                SEMESTER       Role: "+role+"     *");
		System.out.println("*************************************************");
		System.out.println("4) Back to Main Menu");
		checkSelection(num);
	}
	public void logout()
	{
		new HRSystemMain();
		//System.exit(0);
	}
	

}
