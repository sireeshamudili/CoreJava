package stringAssignments;

public class CountCharactersInAString {

	public static void main(String[] args)
	{
		String s="aaabbbbcccaaabb";
		char ch='a';
		int count=0;
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println("Count of a is:" +count);

	}

}
