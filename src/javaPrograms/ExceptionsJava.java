package javaPrograms;

public class ExceptionsJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Handling your exception: try and catch block
		// try {  you will write code that is to be ignored by compiler}
		// catch{ details of exception or corrected code , lines here will be executed by compiler}
		
	String snew1= null;
	try 
	{
	int r= snew1.length();
    System.out.println("the lenght of String1 is calculated" + r);
	}
	catch(NullPointerException e)
	{
		e.printStackTrace();
	}
	
	String s2="sonal";
	
	int a= s2.length();

	System.out.println("the length of string1 is added to lenght of string 2 : " + (10+a));
		

	
	
	}
	
	
	
	
	
	
	
	
	

}
