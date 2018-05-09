
public class HRSystemMain {

	public static void main(String[] args) {
		
		Administrator admin = new Administrator ("Yonas S","Admin","000",'M',"Admin");
		Coordinator cord = new Coordinator ("Yonas S","Coordinator","000",'M',"Coordinator");
		Approver app = new Approver("Yonas S","Approver","000",'M',"Approver");
		Casual cas =new Casual("Yonas S","Casual","000",'M',"Casual");
		
		LoginPage loginPage = new LoginPage();
		String un = loginPage.getUserName();
		String role = app.getRole();
		MainMenu menu = new MainMenu(un,role);
		
		
		
		
		
//		admin.AssignCourse();
//		admin.viewTimetable();
		 
//		Login logger = new Login("Yonas","Password");
//		logger.getUserName();
	}

}
