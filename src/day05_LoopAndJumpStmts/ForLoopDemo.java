package day05_LoopAndJumpStmts;

public class ForLoopDemo {

	public static void main(String[] args) {
		//Ex1: 1...10 numbers
		/*
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}
		*/
		
		//Ex2: 1.....10 even numbers
		/*
		for(int i=2; i<=10; i+=2)
		{
			System.out.println(i);
		}
		*/
		
		//Ex3: 1....10 with even and odd
		/*
		for(int i=1; i<=10; i++)
		{
			if(i%2==0)
			{
			System.out.println(i + "Even");
			}
			else
			{
				System.out.println(i + "Odd");
			}
		}*/
		
		//Ex4: 10....1 numbers
		for(int i=10; i>0; i--)
		{
			System.out.println(i);
		}
	}

}
