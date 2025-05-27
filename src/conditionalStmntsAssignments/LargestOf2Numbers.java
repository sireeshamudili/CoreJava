package conditionalStmntsAssignments;

public class LargestOf2Numbers {

	public static void main(String[] args) {
		
		/*
		int a=150, b=100;
		
		if(a>b)
		{
			System.out.println("a is largest number");
		}
		else
		{
			System.out.println("b is largest number");
		}
		*/
		
		//Using Ternary operator
		int a=150, b=100;
		String res= (a>b) ? "a is greater:" +a : "b is greater:" +b;
		System.out.println(res);

	}

}
