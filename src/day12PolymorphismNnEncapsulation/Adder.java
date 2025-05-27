package day12PolymorphismNnEncapsulation;

public class Adder 
{
	//METHOD OVERLOADING
	
	int a=100, b=200;
	
	void sum()           //Method names should be same
	{
		System.out.println(a+b);
	}
	
	void sum(int x, int y)    //If methods are same number of parameters should be different
	{
		System.out.println(x+y);
	}
	
	void sum(int x, double y)    //If the parameters are same then datatypes should be different
	{
		System.out.println(x+y);
	}
	
	void sum(double x, int y)   //If the datatypes are same then order of the datatypes should be different
	{
		System.out.println(x+y);
	}


}
