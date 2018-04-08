import java.text.SimpleDateFormat;
import java.util.*;
public class Class {
	
	String className;
	String  time;
	String  date ;
	String tutorName;
	String tutorID;
	
	public Class(String name,String time, String date, String tutor, String tutorID)
	{
		this.className = name;
		this.time = time;
		this.date = date;
		this.tutorName =tutor;
		this.tutorID = tutorID;
	}
	public void getClassName()
	{
		System.out.println(className);
		
	}
	public void getDateTime()
	{
		System.out.println(time);
		System.out.print(date);
		
	}
	
	public void getTutor()
	{
		System.out.println(tutorName);
		System.out.println(tutorID);
	}
	
	
}
