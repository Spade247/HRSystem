import java.util.*;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
public class LoginPage {
	
	private String user = "";
	private String password = "";

	public LoginPage()
	{
		
		System.out.println("*************************************************");
		System.out.println("*              Welcome to                       *");
		System.out.println("*                RMIT                           *");
		System.out.println("*              HR System                        *");
		System.out.println("*************************************************");
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("1) Login ");
		System.out.println("2) Forgot Password");
		
		System.out.println("\nPlease enter a number for your selection:");
		int num = 0;
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
		    if(num > 2 || num == 0)
		    	System.out.println("\nPlease enter a number that has been specified:");	
		}
		while (num == 0 || num > 2);
		
		if(num == 1)
		{
			System.out.println("*************************************************");
			System.out.println("*                LOGIN                          *");
			System.out.println("*                 PAGE                          *");
			System.out.println("*************************************************");
			
			boolean status;
			scan.nextLine();
			do
			{
			System.out.print("Username: ");
			user = scan.next();
			System.out.print("Password: ");
			password = scan.next();
			
			Login logger= new Login();
			
			 status = logger.LoginAs(user,password);
			 
			 if(status == false)
			 {
				 System.out.println("Incorrect credentials!\nTry Again.\n\n");
			 }
			 else
			 {
				 System.out.println("Welcome "+user+"!");
				 
			 }
			}
			while(status == false);
		}
		else if (num == 2)
		{
			System.out.println("Please contact service desk at +61 3 9925 0600 for assistance\n");
			LoginPage log = new LoginPage();
			this.user = log.getUserName();
		}
	}
		public String getUserName()
		{
			return this.user;
		}
	
	public String getPassword()
		{
			return password;
		}
		
		
	}

