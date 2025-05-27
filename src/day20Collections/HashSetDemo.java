package day20Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetDemo {

	public static void main(String[] args)
	{
		//Declaration
		
		HashSet myset=new HashSet();
		//List myset=new HashSet();
		//HashSet <String>myset=new HashSet<String>();
		
		//Adding data into Hashlist
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add('A');
		myset.add(true);
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
		System.out.println(myset);   //Will store randomly not in a order
		
		//size of a HashSet
		System.out.println(myset.size());
		
		//Remove element from HashList
		myset.remove(10.5);  //Give the value not a index
		System.out.println("After removal arrraylist is:"+myset);
		
		//Inserting element -- Not possible
		
		//Accessing/Retrieving element  --- Not possible through directly
		//We can get the element to ArryList that is possible
		
		ArrayList al=new ArrayList(myset);
		System.out.println(al);
		System.out.println(al.get(1));
		
		//Read all elements using for loop
		for(Object x:myset)
		{
			System.out.println(x);
		}
		
		//using iterator
		Iterator it=myset.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			
		 //clearing all the elements in hashset
			myset.clear();
			System.out.println("Is hashset is clear?"+myset.isEmpty());
	}

}
