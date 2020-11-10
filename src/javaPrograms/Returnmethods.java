package javaPrograms;

public class Returnmethods {

	
	// modifier  ==> public
	// datatype   ==> reprenets the type of value this method is going to return
	// methodname ==. any unique name
	// creating method which return a value
	public int add()
	{
		int a=10;
		int b=20;
		int result=a+b;
		return result;
		
	}
	
	public String add1()
	{
		int a=10;
		String b="sonal";
		String result=a+b;  //10sonal
		return result;
		
	}
	// this method is called as static method
	public static int sub()
	{
		int a=10;
		int b=5;
		int r= a-b;
		return r;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// when i call the method, it should return a int value	
		
// Calling on method // Using an object		
	//creating an object in java	
	// clasanme objectname = new classname();	

		Returnmethods obj= new Returnmethods();
	
	int x= obj.add();  // method add returns 30 , so x=30;
		
	int l=20;
	int y= l*x;  //20*30
	
	System.out.println(y);
	
	if(x<10) {
		System.out.println("value of x is less than 10");
		
	}
	else
	{
		System.out.println("value of x is more than 10");
		
	}
		
		
	obj.add1();	
	
	// Calling a method without an object
	
	sub();
	
    // classname.methodname;
	UserdefinedMethods2.login();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		

	}

}
