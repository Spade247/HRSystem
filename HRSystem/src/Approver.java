
public class Approver extends User{
	
	
	public Approver(String name, String id, String phone,char gender, String role)
	{
		this.name =name;
		this.ID=id;
		this.phone=phone;
		this.role=role;
		this.gender=gender;
	};
	
	String statusOfRequest ;
	
	public void setUserName(String un)
	{
		this.un = un;
	}
	public String getUserName()
	{
		return un;
	}
	private void ApproveStaffRequest(Request requestMade)
	{
		statusOfRequest = "Approved";
		
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	private void declineStaffRequest(Request requestMade)
	{
		statusOfRequest = "Declined";
	}
	
	private void ApproveTimeStamps(User user)
	{

	}
	public String getRole()
	{
		return this.role;
	}
}
