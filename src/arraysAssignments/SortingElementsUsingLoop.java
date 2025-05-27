package arraysAssignments;

import java.util.Arrays;

public class SortingElementsUsingLoop {

	public static void main(String[] args) 
	{
		int a[]= {30,80,70,40,10};
		
		System.out.println("Before sorting...");
		System.out.println(Arrays.toString(a));
		
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=0; j<a.length-1-i; j++)
			{
				if(a[j]>a[j+1])
				{
					int num=a[j];
					a[j]=a[j+1];
					a[j+1]=num;
				}
			}
		}
		System.out.println("After sorting...");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]+" ");
		}

	}

}
