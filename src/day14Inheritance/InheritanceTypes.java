package day14Inheritance;

//SINGLE HERITANACE(one parent one child)
class A   //parent
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class B extends A   //child
{
	int b;
	void show()
	{
		System.out.println(b);
	}
}

//Multi-level heritance(parent-child-child...)
class C extends B   //child
{
	int c;
	void print()
	{
		System.out.println(c);
	}
}

public class InheritanceTypes {

	public static void main(String[] args)
	{
		/*
		B bobj=new B();
		
		System.out.println(bobj.a);
		System.out.println(bobj.b);
		bobj.display();
		bobj.show();
		*/
		
		C cobj=new C();
		cobj.a=100;
		cobj.b=200;
		cobj.c=300;
		
		cobj.display();
		cobj.show();
		cobj.print();
		
	}

}
