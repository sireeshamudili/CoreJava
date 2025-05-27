package day17DataConversion;

public class DataConversionMethods {

	public static void main(String[] args)
	{
		//Converting String to Int
		
		//String s="Welcome";   Cannot convert into int
		/*
		String s1="10";
		String s2="20";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		*/
		
		//Coverting String to double
		/*
		String s1="10.5";
		String s2="20.0";
		System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));
		*/
		
		//Coverting String into boolean
		/*
		String s="Java";  //other than true, if u pass any string value that will return false
		System.out.println(Boolean.parseBoolean(s));	
		*/
		
		//Converting int, double, boolean, char into String
		int a=10;
		double d=10.5;
		char c='A';
		boolean b=true;
		
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(c));
		System.out.println(String.valueOf(b));
		
	}
}
