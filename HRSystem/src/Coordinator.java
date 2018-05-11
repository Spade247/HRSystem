
public class Coordinator extends User{
	

	public Coordinator(String name, String id, String phone,char gender, String role)
	{
		this.name =name;
		this.ID=id;
		this.phone=phone;
		this.role=role;
		this.gender=gender;
	};
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
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
