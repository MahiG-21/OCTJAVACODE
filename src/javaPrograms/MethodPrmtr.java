package javaPrograms;

public class MethodPrmtr {
	
	//Write a method to add 2 numbers
	// Valriables:
    // int a;
	// int b;
	// a=10, b=20;
	// parametrization
	
	public int add(int a, int b)
	{
		int r= a+b;
		return r;
	}
	
	public void mul(int x, int y)
	{
		
		int r= x*y;
		System.out.println(r);
	}

	
	public static String concatinate(String s1, String s2)
	{
		
		String s3= s1+s2;
		return s3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodPrmtr obj = new MethodPrmtr();
		
	/*	//Calling method add()
		System.out.println(obj.add()); //300
		// calling method mul()
		
		obj.mul();  // calling a void method
		
		String var1=concatinate();   // calling a static method 
		
		System.out.println(var1);
		
		
		System.out.println(concatinate());*/
		
		
		// we want to send data to the method when calling it
		
	
		
		System.out.println(obj.add(10,20));
		
		int result= obj.add(50,30);
		System.out.println(result);
		
		obj.add(700,800);   // when i am calling the method, i want to pass the data
		
		
		System.out.println(concatinate("selenium", "batch"));
		System.out.println(concatinate("abc", "xyz"));
		System.out.println(concatinate("selenium", "UFT"));
		
		obj.mul(30, 40);
		
		


		

		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
