
public class HRSystemMain {

	public static void main(String[] args) {
		User[] users = new User[10];
		users[0]  = (Administrator) new Administrator ("Yonas Admin","Admin","123456789",'M',"Admin");
		users[1]  = (Coordinator)new Coordinator ("Yonas COD","Coordinator","987654321",'M',"Coordinator");
		users[2]  = (Casual)new Casual("Yonas CAS","Casual","000",'M',"Casual");
		users[3]  = (Approver)new Approver("Yonas APP","Approver","0423717241",'M',"Approver");
		Login login = new Login();
		login.setUsers(users);
		
		
		LoginPage loginPage = new LoginPage();
		User currentUser = login.getCurrentUser();
		String un = loginPage.getUserName();
		MainMenu menu = new MainMenu(un,currentUser);
		
		
		
		
		
		
//		admin.AssignCourse();
//		admin.viewTimetable();
		 
//		Login logger = new Login("Yonas","Password");
//		logger.getUserName();
	}

}
