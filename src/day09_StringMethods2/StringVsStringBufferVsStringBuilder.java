package day09_StringMethods2;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args)
	{
		//String: Immutable - We can not change the original value
		String s="Welcome";
		s.concat("to java");
		System.out.println(s); //Welcome - cannot change
		
		//StringBuffer - Mutable - we can change the original value
		StringBuffer sbf=new StringBuffer("Welcome");
		sbf.append("to java");
		System.out.println(sbf);//Welcome to java
		
		//StringBuilder - Mutable - we can change the original value
		StringBuilder sbl=new StringBuilder("Welcome");
		sbl.append("to java");
		System.out.println(sbl);//Welcome to java
	}
	

}
