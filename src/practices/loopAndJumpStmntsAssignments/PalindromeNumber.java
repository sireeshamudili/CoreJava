package practices.loopAndJumpStmntsAssignments;

public class PalindromeNumber {

	public static void main(String[] args)
	{
		int number=121;
		int original = number;
		int reversed=0;
		
		while(number != 0)
		{
			int digit = number % 10;
			reversed = reversed * 10 + digit;
			number = number/10;
		}
		if(original==reversed)
		{
		System.out.println("This is a palindrome number:" + original);
		}
		else
		{
			System.out.println("This is not a palindrome number:" + original);
		}

	}

}
