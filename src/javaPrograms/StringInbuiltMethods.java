package javaPrograms;

public class StringInbuiltMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String l= "Selenium";
		
		int result=l.length();
		System.out.println(result);

	// Converting a String data into Integer data
		
		String x="200";
		
		String x1="selenium";
		
		// If we want to perform arthematic operation on the data that we have recieved from web
		
	// add 100 to 200
		
		// x+100  ==>200100
		//x1+100   ==>selenium100
		
		// x+100 ==>300  // what is required to add the number to data recieved not concatinate
		
	//	the solution is Convert String to integer
		
	String	s ="200";   // 200 is of format number but datatype is String
	
	System.out.println(s+100);  // ==>200100
	
	//parserint ==>Integer
	
	int i=Integer.parseInt(s);  // 200 now is of format number and dattype also int
		
	System.out.println(i+100);   // 200+100 ==>300


	
	String s1= "Hello everyone to selenium class";
	
	// contains() : it will check if a particular string(everyone) is present in the above string(s) provided by user
		
		
	boolean result1 = s1.contains("Everyone")	; 
		
	System.out.println(result1);
		
		
		
		
		
		
		
		
		
		

	}

}
