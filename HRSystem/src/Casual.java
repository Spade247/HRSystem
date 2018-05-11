public class Casual extends User{
	
	
	double PayRate;
	double Hours;
	double Payment;
	String Qualification;
	String Role = "";
	public Casual(String name, String id, String phone,char gender, String role)
	{
		this.name =name;
		this.ID=id;
		this.phone=phone;
		this.role=role;
		this.gender=gender;
	};
	public void setUserName(String un)
	{
		this.un = un;
	}
	public String getUserName()
	{
		return un;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public String getRole()
	{
		return this.role;
	}
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
