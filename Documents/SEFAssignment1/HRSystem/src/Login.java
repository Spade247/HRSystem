
public class Login {
	
	String userName ="";
	String password ="";
	
	public Login(String user, String pass)
	{
		userName = user;
		password = pass;
	}
	
	public String getUserName()
		{
			return userName;
		}
	
	public String getPassword()
		{
			return password;
		}

}
