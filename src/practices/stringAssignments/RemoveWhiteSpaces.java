package practices.stringAssignments;

public class RemoveWhiteSpaces {

	public static void main(String[] args) 
	{
		String s1 = "   wel  come  ";
		String s2=s1.replaceAll("\\s","");
		
		System.out.println("Before removing white spaces:" +s1);
		System.out.println("After removing white spaces:" +s2);

	}

}
