package practices.stringAssignments;

public class RemoveSplCharactersInAString {

	public static void main(String[] args)
	{
		String s="Wel$%come";
		
		String cleaned=s.replaceAll("[^a-zA-Z0-9\\s]", "");
		
		System.out.println("Original:" +s);
		System.out.println("Cleaned:" +cleaned);

	}

}