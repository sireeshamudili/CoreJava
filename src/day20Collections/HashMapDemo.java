package day20Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) 
	{
		//Declaration
		//HashMap hm=new HashMap();
		//Map myMap=new HashMap();
		
		HashMap <Integer, String>hm=new HashMap<Integer, String>();
		
		//Adding pairs(Hahmap is always in key-value pairs)
		hm.put(101,"Siri");
		hm.put(102,"pavan");
		hm.put(103,"prabha");
		hm.put(104,"rakhi");
		hm.put(101,"Siri");
		
		System.out.println(hm); //Duplicates are not allowed
		
		//Size of hashmap
		System.out.println(hm.size());
		
		//Remove a pair
		hm.remove(102);
		System.out.println("After removing pairs are:"+hm);
		
		//Accessing value of the key
		System.out.println(hm.get(101));
		
		//Get all the keys and values from hashmap
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		//To get both keys and values
		System.out.println(hm.entrySet());
		
		//Reading data from hashmap
		//Using enhanced loop
		for(int k:hm.keySet())
		{
			System.out.println(k+"  "+hm.get(k));
		}
	
		//Using iterator
		Iterator<Entry<Integer, String>> it=hm.entrySet().iterator();
		while(it.hasNext())
		{
			Entry<Integer, String> entry=it.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		//Clears all the values
		hm.clear();
		System.out.println("Is values are cleared:"+hm.isEmpty());
	}

}
