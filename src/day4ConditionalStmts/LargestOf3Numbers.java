package day4ConditionalStmts;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		
		//Ex:4 Largest of 3 numbers
		int a=50, b=70, c=30;
		
		if(a>b && a>c)
		{
			System.out.println("a is largest number:" +a);
		}
		else if(b>a && b>c)
		{
			System.out.println("b is largest number:" +b);
		}
		else
		{
			System.out.println("c is largest number:" +c);
		}

	}

}
