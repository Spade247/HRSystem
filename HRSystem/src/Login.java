
public class Login {
	
	String userName ="";
	String password ="";
	User[] users ;
	User currentUser;
	String [] arrUserName = {"Admin","COD","CAS","APP"};
	String [] arrPass = 	{"123"  ,"123","123","123"};
	
	public void setUsers(User[] users)
	{
		this.users = users;
	}
	public boolean LoginAs(String user, String pass)
	{
		userName = user;
		password = pass;
		boolean status = false;
		
		for(int i = 0; i < arrUserName.length; i++)
		{
			if(arrUserName[i].equals(userName) && this.arrPass[i].equals(password))
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
	
	public User getCurrentUser()
	{
			setCurrentUser(userName);
			return currentUser;
	}
	public void setCurrentUser(String userName)
	{
		//CHANGE i TO CHANGE THE ROLE OF THE USER METHOD DOES NOT WORK
		for(int i=0;i < users.length;i++)
		{
			if(users[i].getUserName().equals(this.userName)  )
			{
				
				currentUser = users[i];
				break;
			}
			
		}
			 
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
