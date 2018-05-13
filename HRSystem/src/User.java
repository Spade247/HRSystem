import java.util.Scanner;
import java.util.*;
public abstract class User {
	Scanner scan=new Scanner(System.in);
	String name = "";
	String ID = "";
	String phone = "";
	String role = "";
	char gender ;
	String un= "";
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setUserName(String un)
	{
		this.un = un;
	}
	public String getID()
	{
		return ID;
	}
	public String getPhone()
	{
		return phone;
	}
	public char getGender()
	{
		return gender;
	}
	
	public String getUserName()
	{
		return un;
	}
	public void viewTimetable() {
		
		System.out.println("View Timetable");
	
	}
	public String getRole()
	{
		return this.role;
	}
	public void viewProfile(String user, String role)
	{
		
	}
	public void applyPosition(String user, String role)
	{
			
	}
	public void ViewCasualWorkers(String user, String role)
	{
		
	}
	public void RequestStaff(String user, String role)
	{
		
		
	}
	public void RequestResources(String user, String role)
	{
		
	}
	public void ChangeStartTimes(String user, String role)
	{
				
	}
	public void AddClass(String user, String role)
	{
		
	}
	public void MakeRequestToChangeRole(String user, String role)
	{
		
	}
	public void ApproveStaffRequest(String user, String role)
	{
		
	}
	public void ApproveTimeStamps(String user, String role)
	{
		
		
	}
	public void SetupSemester(String user, String role)
	{
		
	}
	public void setupSemester(String user, String role)
	{
		
	}
	public void AssignCourse(String user, String role)
	{
		
	}
	public void InputTimetable(String user, String role)
	{
		
	}
	public void RetrieveReports(String user, String role)
	{
		
	}
	public void EditProfile(String user, String role)
	{
		
	}
	public void viewApprovalRequests(String user, String role)
	{
		
	}

}
