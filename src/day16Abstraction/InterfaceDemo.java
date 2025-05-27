package day16Abstraction;

interface shape
{
	int length=10;    //final and static
	int width=20;
	
	void circle();  //Abstract method(doesn't need implementation)
	
	default void square()  
	{
		System.out.println("This is square...");
	}
	
	static void rectangle()  
	{
		System.out.println("This is rectangle...");
	}
}

public class InterfaceDemo implements shape{
	
	public void circle()
	{
		System.out.println("This is circle...");
	}

	public static void main(String[] args)
	{
		//Scenario1
		/*
		 InterfaceDemo iobj=new InterfaceDemo();  //The object holds value in the variable of same class name
		 iobj.circle();   //abstract
		 iobj.square();   //default
		 
		 shape.rectangle();   //static method  can directly access from interface
		 */
		
		//Scenario2
		shape sh=new InterfaceDemo();  //The object holds the value in the variable of interface.
		sh.circle();  //abstract
		sh.square();  //default
		
		shape.rectangle();

	}

}
