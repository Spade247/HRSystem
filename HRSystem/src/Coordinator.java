
public class Coordinator extends User{
	
	String name = "";
	String ID = "";
	String phone = "";
	String role = "";
	char gender ;
	public Coordinator(String name, String id, String phone,char gender, String role)
	{
		this.name =name;
		this.ID=id;
		this.phone=phone;
		this.role=role;
		this.gender=gender;
	};
	private void ViewCasualWorkers()
	{

	}

	private void RequestStaff()
	{

	}

	private void RequestResources()
	{

	}

	public void ChangeStartTimes()
	{ 
	
	}

	public void AddClass()
	{
		
	}
	public String getRole()
	{
		return this.role;
	}
}
