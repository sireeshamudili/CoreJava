package day10ClassObject;

public class EmployeeMain {

	public static void main(String[] args)
	{
		Employee emp1=new Employee();
		emp1.eid=101;
		emp1.ename="Siri";
		emp1.job="xyz";
		emp1.sal=10000;
		
		emp1.display();
		
		Employee emp2=new Employee();
		emp2.eid=102;
		emp2.ename="Nithya";
		emp2.job="abc";
		emp2.sal=20000;
		
		emp2.display();
		

	}

}
