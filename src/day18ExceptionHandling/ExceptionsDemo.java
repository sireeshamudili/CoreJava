package day18ExceptionHandling;

import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args)
	{
		
		//Ex1:
		/*
		System.out.println("Program is started...");
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a number...");
		int num=sc.nextInt();
		
		System.out.println(100/num);  //provide 0, throws ArithmeticException
		*/
		
		//Ex2:
		/*
		int a[]=new int[5];
		
		System.out.println("Enter a position(0-4)");
		int position=sc.nextInt();
		
		System.out.println("Enter a value...");
		int value=sc.nextInt();
		a[position]=value;     //Enters 5 value, gives ArrayIndexOfBoundsException
		
		System.out.println(a[position]);
		*/
		
		//Ex3:
		/*
		String s="welcome";
		int num=Integer.parseInt(s);    //Provides characters instead of numbers throws NumberFormatException
		System.out.println(num);
		*/
		
		//Ex4:
		String s=null;
		System.out.println(s.length());  //provides null value throws NullPointerException
		
		System.out.println("program is completed..");
		System.out.println("program is exited...");
		
		
		
		

	}

}
