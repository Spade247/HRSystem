
public class HRSystemMain {

	public static void main(String[] args) {
		
		Administrator admin = new Administrator("Yonas","s3659939","12345678",'M');
		
		admin.AssignCourse();
		admin.viewTimetable();
		 
		Login logger = new Login("Yonas","Password");
		logger.getUserName();
	}

}
