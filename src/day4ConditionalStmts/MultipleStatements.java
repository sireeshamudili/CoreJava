package day4ConditionalStmts;

public class MultipleStatements {

	public static void main(String[] args) {
		
		//We can write boolean values in the if condition not only expressions
		
		/*if(true)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(2);
		}
        */
		
		//We can also write expressions
		/*if(1==2)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(2);
		}
		*/
		
		//Nested loop --- one if condition can have multiple if conditions 
		if(true)
		{
			if(false)
			{
				System.out.println("abc");
			}
			else
			{
				System.out.println("xyz");
			}
		}
		else
		{
			System.out.println("123");
		}
		
	}

}
