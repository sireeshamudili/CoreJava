package arraysAssignments;

public class PrintingEvenOrOddNumbers {

	public static void main(String[] args)
	{
		int a[]= {1,5,4,3,6,7,8,9};
		
		System.out.println("Even Numbers");
		for(int i=0; i<a.length; i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		
		System.out.println("Odd Numbers");
		for(int i=0; i<a.length; i++)
		{
			if(i%2 !=0)
			{
				System.out.println(i);
			}
		}

	}

}
