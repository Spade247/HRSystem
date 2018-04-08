import java.util.*;

public class Coordinator extends User{
	
	ArrayList<Class> classes = new ArrayList<Class>();

	public Coordinator(String name, String id, String phone, char gender)
	{
		name = this.name;
		id = this.id;
		phone = this.phone;
		gender = this.gender;
	}
	
	private void ViewCasualWorkers()
	{

	}

	private void RequestStaff()
	{

	}

	private void RequestResources()
	{

	}

	public void ChangeStartTimes()
	{ 
	
	}

	public void AddClass(String name,String time, String date, String tutor, String tutorID)
	{
		classes.add(new Class(name, time, date, tutor, tutorID));
		
	}
	
	
	public void showClasses()
	{
		for(int i=0; i<classes.size();i++)
		{
		Class cls = (Class)classes.get(i);
		cls.getClassName();
		cls.getDateTime();
		cls.getTutor();
		}
	
	}
}
