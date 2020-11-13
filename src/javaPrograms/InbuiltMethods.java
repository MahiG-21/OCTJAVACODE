package javaPrograms;

public class InbuiltMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// String Methods
		
		//CompareTo()  -- comapre 2 Strings
		
		// the output is going to be:
		// +ve integer value if s1 is greater than s2
		// -ve integer value if s1 is less than s2
		// 0 if both are equal
		
		
		
		// ASCI value associate to it
		// A to Z  ==> 65 to 90
		// a to z ==> 97 to 122
		// 0-9 ==> 48 to 57
		String s1= "selenium";
		String s2="Selenium";
		
		int output=s1.compareTo(s2);
		System.out.println(output);
	
		s1.compareTo("batch");
		//SELENIUM.caompareto(	batch)
		
		System.out.println(s1.compareTo("8PM"));
		
		
		s2.compareTo(s1);
		
	// selenium.caompareto(	SELENIUM)
		
		
	//Method2 :	equals()
		
	String actual ="H2kinfosys";
	String expected="H2KInfosys";
	
	boolean result=actual.equals(expected);   //
	
	System.out.println(result);
	
	if(result==true)
	{
		System.out.println(" website name is correct");
	}
	else
	{
		System.out.println(" website name is not correct");
	}
	
	
	// Method3 :	equalsignorecase()
		
	String s3 ="h2kinfosys";
	
	String s4="H2KInfosys";
	
	System.out.println(s3.equals(s4));  // false
		
	boolean result1 = s3.equalsIgnoreCase(s4); //true
		
		System.out.println(result1);
		
	// Method4 : Concat()
		
		
	String x1="Selenium";
	String x2=" H2kinfosys";
	
	System.out.println(x1.concat(" batch"));
		
	String finalstring=x1.concat(x2);
		
	System.out.println("code to send finalstring to the loginpage in search box");
		
		System.out.println(finalstring);
		
	//Method 5:	
		
		//charAT();
	
		
		String x3="h2kInfosys";
		
		x3.charAt(2);
		
// it is a method which will return the character at the mentioed index for the String		
		
		
// you can print the output in following way:
// by putting the method in print statement
		// OR
// By storing the result in a variable and printing the variable
				
		System.out.println(x3.charAt(2));   //k
		
	//OR
	
		char result2=x3.charAt(2);
	System.out.println(result2);	
		
		
	//Method : subString()
	
	
	String x4="hello everybody in selenium batch";
	
	String subresult= x4.substring(5);
	// this method return substring starting from index provided by us in method till the end
	
	System.out.println(subresult);
	
	String subresult1=x4.substring(6, 16);  // return substring from begin index to endindex-1
	
	
	System.out.println(subresult1);
	
	// method trim()
	// it will trim space on both sides of the string
	
	String x5 =" h2kinfosys   ";
	
	System.out.println(x5.trim());
	
	
	System.out.println(x5.length());  // will give the length of the String
	
	
	String a= "my name is shafali";
	  System.out.println(a.toUpperCase());
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
