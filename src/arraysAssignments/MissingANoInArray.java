package arraysAssignments;

public class MissingANoInArray {

	public static void main(String[] args) 
	{
		int a[]= {1,3,2,5};
		int n=5;
		
		int expectedSum= n*(n+1)/2;
		int actualSum=0;
		
		for(int i=0; i<a.length; i++)
		{
			actualSum += a[i];
		}
		
		int missingNum = expectedSum-actualSum;
		System.out.println("The missing number is:" +missingNum);

	}

}
