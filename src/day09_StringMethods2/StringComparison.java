package day09_StringMethods2;

public class StringComparison {

	public static void main(String[] args) 
	{
		//case1
		/*
		String s1="welcome";
		String s2="welcome";
		
		System.out.println(s1==s2); //true
		System.out.println(s1.equals(s2)); //true
		*/
		
		//case2
		/*
		String s1=new String("welcome");
		String s2=new String("welcome");
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1==s2); //to compare the objects  //false
		System.out.println(s1.equals(s2)); //to compare the values of the object  //false
		*/
		
		//case3:
		String s1="abc";
		String s2=new String("abc");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		

	}

}
