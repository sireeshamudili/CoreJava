package day7ArraysPart2;

public class FindHowManyDuplicatesInArray {

	public static void main(String[] args)
	{
		int a[]= {100,200,300,500,200,700,200};
		
		int num=200;
		int count=0;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==num)
			{
				count++;	
			}
		}
		System.out.println(count);

	}

}
