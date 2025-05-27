package day06_ArraysPart1;

public class SingleDimensionalArray {

	public static void main(String[] args)
	{
	   //Declaring an array
		//Approcah1
		/*int a[]= new int[5]; //Declaration of an array
		
		//Adding values to Array
		a[0]=100;  //Always starts the index value with "0"
		a[1]=200;
		a[2]=300;
		a[3]=400;  //Assigning the values to array
		a[4]=500;
        */
		
		//Approach2
		int a[]= {100,200,300,400,500};
		
		//Find the length of an Array
		System.out.println("Length of an array:" +a.length);
		
		//Read single value from an array
		//System.out.println(a[3]);
		
		//Reading all the values from an array
		//for(int i=0; i<a.length; i++) ---- If we don't know the no.of values in an array
		/*for(int i=0; i<=4; i++)
		{
			System.out.println(a[i]);
		}*/
		
		//Enhanced loop(for...each loop)
		for(int x:a)
		{
			System.out.println(x);
		}
	}

}
