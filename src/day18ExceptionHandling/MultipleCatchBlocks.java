package day18ExceptionHandling;

public class MultipleCatchBlocks {

	public static void main(String[] args)
	{
		System.out.println("Program is started...");
		
		try
		{
		String s=null;
		System.out.println(s.length()); 
		}
		/*
		catch(ArithmeticException e)
		{
			System.out.println("Handled exception");
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e)
		{
			System.out.println("Handled exception");
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e)
		{
			System.out.println("Handled exception");
			System.out.println(e.getMessage());
		}
		*/
		catch(Exception e)  //Exception is super class for all exceptions.
		{
			System.out.println("Handle exception");
			System.out.println(e.getMessage());
		}
		
		System.out.println("Program is finished...");
	}

}
