package day07_ArraysPart2;

import java.util.Arrays;

public class SortingElementsInArray {

	public static void main(String[] args)
	{
		int a[]= {30,60,90,40,60,10,20};
		
		System.out.println("Before sorting...");
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println("After sorting...");
		System.out.println(Arrays.toString(a));

	}

}
