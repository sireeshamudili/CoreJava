package day07_ArraysPart2;

import java.util.Arrays;

public class SortingStrings {

	public static void main(String[] args) 
	{
		String s[]= {"Siri","Nithya","Rakhi","Pavan"};
		
		System.out.println("Before sorting..." +Arrays.toString(s));
		
		Arrays.sort(s);
		
		System.out.println("After sorting..." +Arrays.toString(s));

	}

}
