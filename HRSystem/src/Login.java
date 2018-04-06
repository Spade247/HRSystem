
public class Login {
	
	String userName ="";
	String password ="";
	
	public Login(String user, String pass)
	{
		userName = user;
		password = pass;
	}
	
	public void getUserName()
		{
			System.out.println(userName);
		}
	
	public String getPassword()
		{
			return password;
		}

}
