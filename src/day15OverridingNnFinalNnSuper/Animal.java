package day15OverridingNnFinalNnSuper;

public class Animal {

	String color="White";
	
	void eat()
	{
		System.out.println("Dog is eating....");
	}
}

class Dog extends Animal
{
	String color="Black";
	
	void displayColor()
	{
		System.out.println(super.color);  //Black color
	}
	
	void eat()
	{
		//System.out.println("Dog is barking....");
		super.eat();   //"Dog is eating...."
	}

}
