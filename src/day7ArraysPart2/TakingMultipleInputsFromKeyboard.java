package day7ArraysPart2;

import java.util.Scanner;

public class TakingMultipleInputsFromKeyboard {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		/*
		System.out.println("Enter the First value:");
		int num1=sc.nextInt();
		
		System.out.println("Enter the Second value:");
		int num2=sc.nextInt();
		
		System.out.println("Addition of 2 numbers:" +(num1+num2));
        */
		
		System.out.println("Enter the First value:");
		int num=sc.nextInt();
		System.out.println("Given the value is:" +num);
		
		System.out.println("Enter the Name:");
		String name=sc.next();
		System.out.println("Given the name is:" +name);
		
		System.out.println("Enter the unknown value:");
		Object value=sc.next();
		System.out.println("Given the value is:" +value);
		
		
	}

}
