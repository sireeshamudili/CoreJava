package day02_VariablesAndDataTypes;

public class VariablesDemo
{

	public static void main(String[] args)
	{
		/*
		int a;     //Declaration
		a = 10;    //Assignment
		*/
		
		/*
		int a = 10;  //Declaration + Assignment
		System.out.println(a); //10
		
		a = 20;
		System.out.println(a);
		*/
		
		//Approach 1 -----If all the variables are belongs to different data type
		/*int a = 100;
		int b = 200;
		int c = 300;
		*/
		
		//Approach 2 -----If all the variables are belongs to same data type
		/*int a, b, c;
		a = 100;
        b = 200;
        c = 300;
        */
		
        //Approach 3 -----If all the variables are belongs to same data type
        int a = 100, b = 200, c = 300;
		System.out.println("Tha value of a is:" + a);
		System.out.println("Tha value of a is:" + b);
		System.out.println("Tha value of a is:" + c);
		
		System.out.println("The values of a, b, c are:" + a+" "+b+" "+c);
	}

}
