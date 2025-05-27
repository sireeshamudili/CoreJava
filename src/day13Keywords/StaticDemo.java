package day13Keywords;

public class StaticDemo {
	
	static int x=10;  //Static variable
	int y=20;         //Non-static variable
	
	static void m1()  //Static method
	{
		System.out.println("This is static method");
	}
	
	void m2()        //Non-static method
	{
		System.out.println("This is not a static method");
	}

	//When we have main method in the same class the static methods will work
	public static void main(String[] args)
	{
		//Static methods can access directly static stuff(Variables & Methods)----without object
		System.out.println(x);
		m1();
		
		//static methods can access non-static methods through object only
		StaticDemo st=new StaticDemo();
		System.out.println(st.y);
		st.m2();
	}

}
