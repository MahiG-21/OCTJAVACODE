package javaPrograms;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// logical operators are applied on relation expressions (a<b) or(100<200)
		
		// AND Logical operator ==> &&
		
		boolean result = ((100<200)&&(200<300));
		
		System.out.println(result);
		// AND --> TRUE && TRUE ==> TRUE
        
		//Example 2 ==> AND operator
		boolean result1 = ((100==200)&&(200<300));
		
		// False && True  ==> false
		System.out.println(result1);
		
		// OR operator  ==> ||
		
           boolean resultOR = ((100==200)||(200<300));
           
           //  False OR True
		
		System.out.println(resultOR);  //True
		
		
		  boolean resultOR1 = ((100==200)||(200==300));
          
          //  False OR False  ===>False
		
		System.out.println(resultOR1);  //False
		
		
		// Logical not Operator  (!)
		
		boolean resultNot= !(100==100);
		
		System.out.println(resultNot);
				
		
		
		
	}

}
