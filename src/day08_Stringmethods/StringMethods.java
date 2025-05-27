package day08_Stringmethods;

public class StringMethods {

	public static void main(String[] args)
	{
		/*
		//String s="Welcome";
		String s = new String("Welcome");
		System.out.println(s);
		*/
		
		//Method1: length() - returns of a string(number of characters)
		/*
		String s = "Welcome";
		int l=s.length();
		System.out.println(l);
		//s.length();
		//System.out.println(s.length);
		//System.out.println("Welcome".length);
		*/
		
		//Method2: concat() - joining strings
		String s1="Welcome";
		String s2=" to Java";
		String s3=" Automation";
		//System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		//System.out.println(s1+s2+s3);
		//System.out.println(s1.concat(s2+s3));
		System.out.println(s1.concat(s2).concat(s3));
		
		//Method3: trim() - removes spaces right and left side spaces
		String s= " Welcome ";
		System.out.println(s); //Print along with spaces
		System.out.println(s.trim());
		System.out.println("Before trimming:" +s.length());
		System.out.println("After trimming:" +s.trim().length());
		
		//Method4: charAt() - returns a character from a string based on index
		s="Welcome";
		System.out.println(s.charAt(5));
		
		//Method5: contains() - returns true/false 
		System.out.println(s.contains("Wel"));
		System.out.println(s.contains("wel"));
		
		//Method6: equals(), equalsIgnoreCase() - compare strings
		s1="Welcome";
		s2="welcome";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		//Method7: replace() - replace single/multiple(sequence) of characters in a string
		s="Welcome to automation selenium java";
		System.out.println(s.replace('o', 'j'));
		System.out.println(s.replace("java", "python"));
		
		String amount="#15,60,90";//Remove characters using replace()
		System.out.println(amount.replace("#",""));
		System.out.println(amount.replace("#","").replace(",", ""));
		
		//Method8: substring() - extract substring from a main string
		//starting index=0
		//ending index=1
		s="Welcome";
		System.out.println(s.substring(2,5));
		
		//Method9: toLowerCase(), toUpperCase()
		s="Welocme";
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		//Method10: split() - split the string into multiple parts based on delimeter (returns array of strings)
		s="abc@gmailcom";
		String a[]=s.split("@");
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		
	}

}
