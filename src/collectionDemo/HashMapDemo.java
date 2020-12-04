package collectionDemo;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Hashmap also create list but in this list we will store data in fowlloing
		// key, value
		// integer, string data
		// (101 , "jack")
		
		HashMap<Integer, String> hmap= new HashMap<Integer, String>();
		
		//hmap.put(key ,value)
		hmap.put(101,"Jack");
		hmap.put(102,"TOM");
		hmap.put(103,"Dave");
		hmap.put(104,"Maya");
		hmap.put(105,"TIM");
		
		
		System.out.println(hmap.get(102)); //tom
		
		System.out.println(hmap.get(103)); //Dave
		
		System.out.println(hmap);
		
		
	for(Integer temp:hmap.keySet())
	{
	
		System.out.println(hmap.get(temp));
	}
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
