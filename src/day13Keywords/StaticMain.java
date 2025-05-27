package day13Keywords;

public class StaticMain {

	public static void main(String[] args)
	{
		//Static methods can access directly static stuff(Variables & Methods)----without object
		System.out.println(StaticDemo.x); //We have to use class name before static variable
		StaticDemo.m1();  //We have to use class name before static method

		//static methods can access non-static methods through object only
		StaticDemo st=new StaticDemo();
		System.out.println(st.y);
		st.m2();

	}

}
