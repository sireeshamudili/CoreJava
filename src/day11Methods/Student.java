package day11Methods;

public class Student 
{
	int sid;
	String sname;
	char grad;
	
	//Different types of storing data in variables
	
	//1)Using object reference variables
	void printStudentData()
	{
		System.out.println(sid+"  "+sname+"  "+grad);
	}
	
	//2)Using Method
	void setStudentData(int id, String name, char gr)
	{
		sid=id;
		sname=name;
		grad=gr;
	}
	
	//3)Using Constructor
	Student(int id, String name, char gr)
	{
		sid=id;
		sname=name;
		grad=gr;
	}
	

}
