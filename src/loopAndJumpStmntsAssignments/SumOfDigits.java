package loopAndJumpStmntsAssignments;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int number=65367;
		int sum=0;
		
		while(number!=0)
		{
			int digit = number % 10; //Get the last digit
			sum += digit; //Add it to the sum
			number = number/10; //Remove the last digit
		}
		System.out.println("The sum of digits is:" +sum);

	}

}
