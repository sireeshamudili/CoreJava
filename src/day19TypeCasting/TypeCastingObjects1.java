package day19TypeCasting;

class parent
{
	String name="siri";
	
	void m1()
	{
		System.out.println("this is m1 from parent..." );
	}
}

class child extends parent
{
	int id=101;
	
	void m2()
	{
		System.out.println("this is m2 from child..." );
	}
}

public class TypeCastingObjects1 {

	public static void main(String[] args)
	{
		child c=new child();
		System.out.println(c.name);
		c.m1();
		
		System.out.println(c.id);
		c.m2();
		
		/*
		parent p=new child();  //upcasting
		System.out.println(p.name);
		p.m1();
		
		System.out.println(p.id); // we cannot access from child class
		p.m2();
		*/
		
		parent p1=new parent();
		child c1=(child) p1;   //downcasting
		
		System.out.println(c1.name);
		c1.m1();
		
		System.out.println(c1.id);
		c1.m2();
		
		
	}

}
