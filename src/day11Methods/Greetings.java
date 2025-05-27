package day11Methods;

public class Greetings 
{
	//1)No parameters/arguments----No value
	void m1()
	{
		System.out.println("Hello...");
	}
	
	//2)No parameters-----Returns a value
	String m2()
	{
		return "How are you?";
	}
	
	//3)Takes parameters----no value
	void m3(String name)
	{
		System.out.println("Hello" +name);
	}
	
	//4)Takes parameters----returns value
	String m4(String name)
	{
		return("Hello" +name);
	}
	

}
