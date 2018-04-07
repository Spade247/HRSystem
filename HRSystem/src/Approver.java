
public class Approver extends User{
	
	String statusOfRequest ;

	private void ApproveStaffRequest(Request requestMade)
	{
		statusOfRequest = "Approved";
		
	}
	
	private void declineStaffRequest(Request requestMade)
	{
		statusOfRequest = "Declined";
	}
	
	private void ApproveTimeStamps(User user)
	{

	}

}
