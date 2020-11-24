package oOPSConcepts;

public class ClassC extends ClassB {
	
	public void creaditcard()
	{
		System.out.println("creditcard customer information test case");
	}
	
	public void logout()
	{
		System.out.println("logout from the credit card page");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// pre requiste: 
		//loginto the application, 
		//enter details through home loans and 
		//make payment by creditcard
	ClassC obj = new ClassC();	
	openbrowser();
	obj.login();
	obj.homeloans();
	obj.creaditcard();
	obj.logout();

	
		
		
		
	}

}
