
public class Administrator extends User {
	
	String adminName = "";
	String adminID = "";
	String adminPhone = "";
	char adminGender ;
	public Administrator(String name, String id, String phone, char gender)
	{
		 adminName = name;
		 adminID = id;
		 adminPhone = phone;
		 adminGender = gender;
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
