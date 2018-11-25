public class Student {
	public String name;
	public int age;
	public String gender;
	public int year;
	public String course;
	public static String university="Cybertek"; // object can't change this value, it belongs to class, we use 'static'

	//right click =>Source => Generate constructor using fields=>
	public Student(String name, int age, String gender, int year, String course) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
		
	}
	
	
public void attendLecture(){
	System.out.println(name+" is attending lecture at "+university);
}



public void submitAssignment() {
	System.out.println(name+" is submitting assignment at "+university);
}

public void attendLab() {
	System.out.println(name +" is attending lab at "+university);
}


}