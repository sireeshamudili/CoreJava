package practices.conditionalStmntsAssignments;

public class SmallestOf3Numbers {

	public static void main(String[] args) {
		
		int a=5, b=8, c=4;
		
		if(a<b && a<c)
		{
			System.out.println("a is smallest number");
		}
		else if(b<c && b<a)
		{
			System.out.println("b is smallest number");
		}
		else
		{
			System.out.println("c is smallest number");
		}

	}

}
