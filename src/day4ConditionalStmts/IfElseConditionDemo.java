package day4ConditionalStmts;

public class IfElseConditionDemo {

	public static void main(String[] args)
	{
		//Ex1: personAge>=18 ---- Eligible for vote
		//     personAge<18  ---- Not eligible for vote
		int person_age = 15;
		   
		if(person_age>=18)
		{
			System.out.println("Eligible for vote");
		}
		else
		{
			System.out.println("Not eligible for vote");
		}

	}

}