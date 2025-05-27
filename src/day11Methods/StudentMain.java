package day11Methods;

public class StudentMain {

	public static void main(String[] args)
	{
		//Student std=new Student();
		
		//1)Using object reference variables
		/*
		std.sid=101;
		std.sname="Siri";
		std.grad='A';
		
		std.printStudentData();
		
		//2)Using Method
		std.setStudentData(101, "Siri", 'A');
		std.printStudentData();
		*/
		
		//3)Using Constructor
		Student std=new Student(101, "Siri", 'A');
		std.printStudentData();

	}

}
