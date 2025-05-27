package stringAssignments;

public class StringPalindrome {

	public static void main(String[] args)
	{
		String s="madam";
		String original=s;
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		if(original.equals(rev))
		{
			System.out.println("This string is palindrome");
		}
		else
		{
			System.out.println("This string is not palindrome");
		}
		
	}

}
