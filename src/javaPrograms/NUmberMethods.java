package javaPrograms;

public class NUmberMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Converting int to String
		
				int i = 10;
				
				System.out.println(i+100);   // 110
				
				// I want ==> concatination  ==> 10100
				// Convert the interger variable into a String valiable
				
				//toString() is a static method
				// Classname.methodname  ==> Integer.toString()
				
				String s=Integer.toString(i);
				
				System.out.println(s+100);   // 10100


			//	valueOf() method ==>presnt in both  String and Integer class
				
				//convert String to int
				String s="100";
				
				int i =Integer.valueOf(s);
				
				
				System.out.println(i+100);  //200
				
				
				// convert an int to String
				
				int x=10;
				
			String s1	=String.valueOf(x);
				
			System.out.println(s1+100);  //10100	
			


			  //CompareTo() 
			// used to compare 2 numbers , and output is going to be int value
			// 1 ==> if number1 > number2
			//0 --> if number1 = number2
			// -1 ==> if number1<number2

			String s="selenium";
			
			s.compareTo("batch");
				
			//int i=10;
			
			Integer i=10;
			
			System.out.println(i.compareTo(100));  // -1
				
			System.out.println(i.compareTo(5))	;  //1
			
			System.out.println(i.compareTo(10));  //0



		      //  equals()
				
				// but will compare only if 2 numbers are equal or not
				// output is going true or false
				
			
				
				Integer x=10;
				Integer y=20;
				
				boolean result=x.equals(y);  
				
				System.out.println(result);
				
				System.out.println(x.equals(10));   // true	
		
		
		


	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
