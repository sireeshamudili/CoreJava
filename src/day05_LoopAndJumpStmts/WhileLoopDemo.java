package day05_LoopAndJumpStmts;

public class WhileLoopDemo {

	public static void main(String[] args) {
		
	   //Ex1: print 1.....10 numbers
		
		/*int i=1; //Initialization(Where to start)
		
		while(i<=10) //Condition(How many times should repeat)
		{
			System.out.println(i);
			i++; //Incrementation
		}
		*/
		
		//Ex2: Print Hello msg 10 times
		
		/*
		int i=1;
		while(i<=10)
		{
			System.out.println("Hello");
			i++;
		}
		*/
		
		//Ex3: print even numbers btw 1....50
		
		//Approach1
		/*
		int i=2;
		while(i<=50)
		{
			System.out.println(i);
			i+=2;
		}
		*/
		
		//Approach2
		/*
		int i=1;
		while(i<=50)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}
		*/
		
		//Ex4: print 1.....10 numbers with even and odd
		/*
		int i=1;
		while(i<=10)
		{
			if(i%2==0)
			{
				System.out.println(i + "Even");
			}
			else
			{
				System.out.println(i + "Odd");
			}
			i++;
		}
		*/
		
		//Ex5: print 10.....1 numbers
		int i=10;
		while(i>0)
		{
			System.out.println(i);
			i--;
		}
		

	}

}
