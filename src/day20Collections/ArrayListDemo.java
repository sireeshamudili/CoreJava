package day20Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args)
	{
		//Declaration
		ArrayList mylist=new ArrayList();
		//List mylist=new ArrayList();
		
		//ArrayList <Integer>mylist=new ArrayList<Integer>(); //To get specific homogeneous data 
		
		//Adding data into arraylist
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		System.out.println(mylist);  //Will store the data in order through Index[0,1,2,3...]
		
		//size of ArrayList
		System.out.println("The length of the arraylist:" +mylist.size());

		//printing ArrayList
		System.out.println("Printing data from arraylist:"+mylist);
		
		//Remove element from ArrayList
		mylist.remove(0);  //Index
		System.out.println("After removal arrraylist is:"+mylist);
		
		//Inserting some value in existing ArrayList
		mylist.add(3,'B');
		System.out.println("AfterInsertion:"+mylist);
		
		//modify/replace/change element in the ArrayList
		mylist.set(3, false);
		System.out.println("After replacing:" +mylist);
		
		//Accessing element from ArrayList
		System.out.println(mylist.get(1));
	
		//Reading all the elements from ArrayList
		//using for loop
		for(int i=0; i<mylist.size(); i++)
		{
			System.out.println(mylist.get(i));
		}
		
		//using enhanced loop
		for(Object x:mylist)
		{
			System.out.println(x);
		}
		
		//using iterator
		Iterator it=mylist.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//Checking ArrayListis empty or not
		System.out.println("Is arraylist is empty?"+mylist.isEmpty());
		
		//Removing multiple elements in the ArrayList
	    ArrayList mylist2=new ArrayList();
	    mylist2.add("welcome");
	    mylist2.add(null);
	    
	    mylist.removeAll(mylist2);
	    System.out.println("After removing multiple elements:"+mylist);
	    
	    //Removing all elements from ArrayList
	    mylist.clear();
	    System.out.println("Is arraylist is clear?" +mylist.isEmpty());
	}

}
