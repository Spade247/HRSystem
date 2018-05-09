
public abstract class User {

	String name = "";
	String ID = "";
	String phone = "";
	String role = "";
	char gender ;
	
	public void viewTimetable() {
		
		System.out.println("View Timetable");
	
	}
	public String getRole()
	{
		return this.role;
	}

}
