package day07_ArraysPart2;

public class SearchingElementInArray {

	public static void main(String[] args) 
	{
		int a[]= {10,20,30,40,50,60};
		
		int search_Element=50;
		boolean status=false;
		
		for(int i=0; i<a.length; i++)
		{
			if(search_Element==a[i])
			{
				System.out.println("Element Found");
				status=true;
				break;
			}
		}
		if(status==false)
		{
			System.out.println("Element Not found");
		}
		
		

	}

}
