package oOPSConcepts;

public class ClassB extends ClassA {

	
	public void homeloans()
	{
		System.out.println("Testcase for executing homeloan functionality");
	}
	
	public void logout()
	{
		System.out.println("logout of the application from homeloans page");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassB obj = new ClassB();
		
		// in order enter details of customer in homeloan you have to loginto an application
		
		obj.login();
		obj.homeloans();
		// in order to call a static we dont need an object
		
		openbrowser();
		
		obj.logout();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
