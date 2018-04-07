
public class Casual extends User{
	
	double PayRate;
	double Hours;
	double Payment;
	String Qualification;
	String Role = "";
	
	public void MakeRequestToChangeRole()
	{
          System.out.print('The request has been made!');
	}
	
	public double calculatePayment()
	{
	Payment=PayRate*Hours;
	}
	
	public String getQualification()
	{
	 return Qualification;	
	}
	
	
	
}
