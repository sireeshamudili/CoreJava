package day18ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args)
	{
		try
		{
		String s=null;
		System.out.println(s.length()); 
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch block handle exception");  //finally block executed always whether try and catch blocks gets exceptions.
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("you entered into finally block");
		}
		
		System.out.println("Program is finished...");
	  
	}

}
