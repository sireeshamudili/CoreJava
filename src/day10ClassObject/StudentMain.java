package day10ClassObject;

public class StudentMain {

	public static void main(String[] args)
	{
	   Student std1=new Student();
	   std1.sid=201;
	   std1.sname="Pavan";
	   std1.sgrade="A";
	   
	   std1.printData();
	   
	   Student std2=new Student();
	   std2.sid=301;
	   std2.sname="Rakhi";
	   std2.sgrade="B";
	   
	   std2.printData();

	}

}
