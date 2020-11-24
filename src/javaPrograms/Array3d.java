package javaPrograms;

public class Array3d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][][] arr = {

		           { 

		               {1,2,3,4}, 

	                       {0,9,1}, 

	                       {3,5,7}, 

	                       {8,1,3}

                }

               };

	   
	        for (int[][] array1: arr)
	        {
	            for (int[] array2: array1) 
	            {
	                for(int temp: array2) 
	                {
	                    System.out.println(temp);
	                }

	}
	        }
	        
	        
	        
 
	}

}
