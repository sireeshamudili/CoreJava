package day07_ArraysPart2;

import java.util.Arrays;
import java.util.Scanner;

public class ReadindAndWritingDataIntoArray {

	public static void main(String[] args)
	{
		int a[]=new int[5];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println("Enter the value in the position of:" +i+":");
			a[i]=sc.nextInt();
		}
		System.out.println("Printing array Elements:");
		System.out.println(Arrays.toString(a));

	}

}
