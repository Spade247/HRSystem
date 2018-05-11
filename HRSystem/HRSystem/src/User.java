
public abstract class User {

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

}
