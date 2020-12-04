package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Collections: it is framwork which is collection interfaces and classes
		//used for fetching data, deleting data, sorting data, manipulating data
		
		// Arrays: collection of data -->length of the array is fixed
		  
		int [] array1 = new int[5];
   
		// we have an array --array1, storing only integer values, number of values =5	
		
		// Arraylist : store dynamic data and size of the array is not fixed
		// array can grow dynamically
		
	// arraylist class is part of util package in java
		
	 ArrayList arr1= new ArrayList();
	
	 //To add values in the arraylist --add()
		
	arr1.add(12);
	arr1.add("sonal");
	arr1.add(2.34);
	arr1.add(true);
	
	
	// Size of the arraylist ==> size()
	
	int x= arr1.size();
	
	System.out.println("size of arraylist is:" + x);
	
	//Use forloop to print the arraylist
	
	for(int i=0;i<arr1.size();i++)
	{
		System.out.println(arr1.get(i));
	}
	
	//OR
	
	// To ftrech values from an arraylist use iterator() method
	
	 Iterator it  =arr1.iterator();
	 
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	// non generic arraylist
	
	ArrayList<Integer> arr2= new ArrayList<Integer>();
	
	arr2.add(12);
	arr2.add(13);
	


	
	ArrayList<String> arr3= new ArrayList<String>();
	
	arr3.add("sonal");
	arr3.add("mittal");
	arr3.add("mittal");
	arr3.add("mittal");
	arr3.add("mittal");
	
	//For-each loop
	
	for(String temp:arr3)
	{
		System.out.println(temp);
	}
	
	// removing the values from arrayList
	
	
	arr3.remove(0);
	arr3.removeAll(arr3);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
