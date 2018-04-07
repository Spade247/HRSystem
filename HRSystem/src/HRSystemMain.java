
public class HRSystemMain {

	public static void main(String[] args) {
		
		Administrator admin = new Administrator();

		admin.AssignCourse();
		 
		Login logger = new Login("Yonas","Password");
		logger.getUserName();
	}

}
