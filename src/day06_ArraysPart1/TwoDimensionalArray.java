package day06_ArraysPart1;

public class TwoDimensionalArray {

	public static void main(String[] args)
	{
		//Declaring an array
		
		//Approcah1
		/*int a[][]= new int[3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		*/
		
		//Approach2
		int a[][]= {{100,200},{300,400},{500,600}};
		
		//Find the length of an Array
		System.out.println("Length of rows:" +a.length);
		System.out.println("Length of columns:" +a[0].length);
		
		//Read single value from an array
		System.out.println(a[2][1]);
		
		//Reading all the values from an array
		//for(int i=0; i<a.length; i++)
		for(int r=0; r<=2; r++)
		{
			for(int c=0; c<=1; c++)
			{
				System.out.println(a[r][c]);
			}
			System.out.println();
		}
		
		//Enhanced for loop
		for(int arr[]:a)
		{
			for(int x:arr)
			{
				System.out.println(x);
			}
		}

	}

}
