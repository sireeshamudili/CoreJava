package day11Methods;

public class ConstructorDemo {
	
	int x,y;
	
	ConstructorDemo() //Default Constructor(Without parameters)
	{
		x=100;
		y=200;
	}
	
	ConstructorDemo(int a, int b) //Parametrized constructor
	{
		x=a;
		y=b;
	}
	
	void Sum()
	{
		System.out.println(x+y);
	}

	public static void main(String[] args)
	{
		//ConstructorDemo cd=new ConstructorDemo(); //Default constructor
		ConstructorDemo cd=new ConstructorDemo(10,20); //Parametrized constructor
		cd.Sum();
		

	}

}
