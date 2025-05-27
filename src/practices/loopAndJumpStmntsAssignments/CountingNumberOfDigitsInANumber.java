package practices.loopAndJumpStmntsAssignments;

public class CountingNumberOfDigitsInANumber {

	public static void main(String[] args)
	{
		int number=6473268;
		int count=0;
		
		if(number==0)
		{
			count=1;
		}
		else
		{
			while(number!=0)
			{
				number = number/10;
				count++;
			}
		}
		System.out.println("No. of digits in this number:" +count);
		

	}

}
