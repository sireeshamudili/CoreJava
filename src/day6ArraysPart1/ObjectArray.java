package day6ArraysPart1;

public class ObjectArray {

	public static void main(String[] args) 
	{
	   //Heterogeneous data(different types of datatypes)
	   Object a[]= {100, 10.7, 'A', "Hiiii", true};
	   
	   /*
	   for(Object x:a)
	   {
		   System.out.println(x);
	   }
	   */
	   
	   //Using for loop
	   for(int i=0; i<=a.length-1; i++)
	   {
		   System.out.println(a[i]);
	   }

	}

}
