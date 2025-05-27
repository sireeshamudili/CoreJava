package practices.operatorsAssignment;

public class SwappingOf2Numbers {

	public static void main(String[] args) 
	{
		int a=10, b=20;
		System.out.println("Befor swapping: a is " +a+ " " + "and b is " +b);
		
		a = a+b; //a=10+20 ---- a=30;
		b = a-b; //b=30-20 ---- b=10;
		a = a-b; //a=30-10 ---- a=20;
		
		System.out.println("After swapping: a is " +a+ " "+ "and b is " +b);
		
	}

}