package javaPrograms;

public class UserdefinedMethods2 {

	// method2 : write method which don't return value
	
	public void mul()
	{
		int a=10;
		int b=20;
		int resultmul=a*b;
		System.out.println(a*b);   //200
		System.out.println(resultmul);  //200
	}
	
	public static void login()
	{
		System.out.println("loginto the application");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// when i call a void method, it will not give any value
		// create an object and call the method
		
		UserdefinedMethods2 obj = new UserdefinedMethods2();	
		obj.mul();   
		
		// calling a static method from one class to another class
	
		Returnmethods.sub();
		
		login();
		
	}

}
