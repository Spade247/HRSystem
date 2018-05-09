
public class Login {
	
	String userName ="";
	String password ="";
	
	String [] un = {"Admin","COD","CAS","APP"};
	String [] pass = {"123","123","123","123"};
	
	public boolean LoginAs(String user, String pass)
	{
		userName = user;
		password = pass;
		boolean status = false;
		
		for(int i = 0; i < un.length; i++)
		{
			if(un[i].equals(userName) && this.pass[i].equals(password))
			{
				status = true;
				break;
			}
			else
			{
				status = false;
			}
					
		}
		return status;
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
