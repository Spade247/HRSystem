
public class Administrator extends User {
	
	String adminName = "";
	String adminID = "";
	String adminPhone = "";
	String role = "";
	char adminGender ;
	public Administrator(String name, String id, String phone, char gender,String role)
	{
		 adminName = name;
		 adminID = id;
		 adminPhone = phone;
		 adminGender = gender;
		 this.role=role;
	}
	public String getRole()
	{
		return this.role;
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
