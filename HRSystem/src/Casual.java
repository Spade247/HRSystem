public class Casual extends User{
	
	String name = "";
	String ID = "";
	String phone = "";
	String role = "";
	char gender ;
	public Casual(String name, String id, String phone,char gender, String role)
	{
		this.name =name;
		this.ID=id;
		this.phone=phone;
		this.role=role;
		this.gender=gender;
	};
	double PayRate;
	double Hours;
	double Payment;
	String Qualification;
	String Role = "";
	
	public void MakeRequestToChangeRole()
	{
          System.out.print("The request has been made!");
	}
	
	public double calculatePayment()
	{
		Payment=PayRate*Hours;
		return Payment;
	}
	
	public String getQualification()
	{
	 return Qualification;	
	}
	
	
	
}
