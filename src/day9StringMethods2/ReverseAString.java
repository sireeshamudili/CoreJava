package day9StringMethods2;

public class ReverseAString {

	public static void main(String[] args)
	{
		//Approach1: Using length(), charAt();
		String s="Welcome";
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		//Approach2: Without using string methods
		/*
		String s="Welcome";
		String rev="";
		
		char a[]=s.toCharArray();
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+a[i];
		}
		System.out.println(rev);
        */
		
		//Approach3: Using StringBuffer class
		/*
		StringBuffer s=new StringBuffer("Welocme");
		System.out.println(s.reverse());
		*/
		
		//Approach4: Using StringBuilder class
		/*
		StringBuilder s=new StringBuilder("Welocme");
		System.out.println(s.reverse());
		*/
	}

}
