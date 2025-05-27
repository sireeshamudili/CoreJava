package practices.stringAssignments;

public class CountWordsInAString {

	public static void main(String[] args)
	{
		String s="Welcome to java";
		
		String[] words=s.split(" ");
		//String[] words=s.trim().split("\\s"); ---To remove multiple spaces
		System.out.println("The total no. of words are:" +words.length);

	}

}
