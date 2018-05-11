
public class Administrator extends User {
	
	
	public Administrator(String name, String id, String phone, char gender,String role)
	{
		 this.name = name;
		 this.ID = id;
		 this.phone = phone;
		 this.gender = gender;
		 this.role=role;
	}
	public String getRole()
	{
		return this.role;
	}
	public void setUserName(String un)
	{
		this.un = un;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
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
	private void SetupSemester()
	{
		
	}

	public void AssignCourse()
	{
		System.out.println("ASSIGN COURSE METHOD");
	}

	private void InputTimetable()
	{

	}

	private void RetrieveReports()
	{

	}


}
