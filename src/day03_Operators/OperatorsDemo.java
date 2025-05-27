package day03_Operators;

public class OperatorsDemo {

	public static void main(String[] args)
	{
       //Arithmetic operators + - * / %
		int a = 20, b = 10;
		System.out.println("Sum of a and b:" +(a+b));
		System.out.println("Diff of a and b:" +(a-b));
		System.out.println("Multiplication of a and b:" +(a*b));
		System.out.println("Division of a and b:" +(a/b));
		System.out.println("Modulo division of a and b:" +(a%b));
		
		//Relational/Cpmparison operators > >= < <= != ==
		//Always return boolean value ---- True/False
		System.out.println(a>b); //true
		System.out.println(a<b); //false
		System.out.println(a>=b); //true
		System.out.println(a<=b); //false
		b=20;
		System.out.println(a<=b); //true
		System.out.println(a>=b); //true
		
		System.out.println(a!=b); //false
		System.out.println(a==b); //true
		
		//Logical operators ---- && || ! return boolean values
		//Works btw two boolean values
		boolean x=true;
		boolean y=false;
		System.out.println(x && y ); //false
		System.out.println(x || y ); //true
		System.out.println(!x); //false
		System.out.println(!y); //true
		
		boolean b1 = 10>20;
		System.out.println(b1); //false
		
		boolean b2 = 20>10;
		System.out.println(b1); //true
		
		System.out.println(b1 && b2); //false
		System.out.println(b1 || b2); //true
		
	}

}
