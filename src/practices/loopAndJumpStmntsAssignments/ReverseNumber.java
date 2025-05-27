package practices.loopAndJumpStmntsAssignments;

public class ReverseNumber {

	public static void main(String[] args)
	{
		int number=12345;
		int reversed=0;
		
		while(number !=0)
		{
			int digit = number % 10; //Gives the last number
			reversed =reversed * 10 + digit; //Adds the digit to the reversed number
			number = number/10; //Removes the last digit
		}
		System.out.println("Reversed Number:" +reversed);
		

	}

}
