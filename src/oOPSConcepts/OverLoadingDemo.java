package oOPSConcepts;

public class OverLoadingDemo {

	//2nd concept in oops is polymorphism -- overloading , overriding
	// Overloading : in a class we can have methods with same name just ensure they have differ
	//different sets of parameters
	
	//1. Same methods name --same set of parameters ==>different data types
	// 2. Same methods name --same data type ==>different sets of parameters
	public int add(int a, int b)
	{
		int c= a+b;
		return c;
	}
	
	public String add(String x, String y)
	{
		String c=x+y;
		return c;
	}
	
	public int add(int a, int b, int c)
	{
		int x= a+b+c;
		return x;
	}
	
	public void add()
	{
		int c=10+20;
		System.out.println(c);
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		OverLoadingDemo obj = new OverLoadingDemo();
		
		obj.add();
		System.out.println(obj.add(10, 20));
		System.out.println(obj.add("selenium", "batch"));
		System.out.println(obj.add(10, 20, 30));
		
		
		
	}

}
