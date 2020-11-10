package javaPrograms;

public class ArraysProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=10;
		
		//Arrays: int a[5]=10,20,30,40,50
		// it can store multiple values but all of them should of same datatype
	// Length of the array	
		
	
	// Method1 of writing an array
	
		//datatype nameofarray[];
		
		int arr[];
		
		// nameofarray= new datype[3]
		// 3 represents length of the array
		arr= new int[3];
		
		// assigning the value sof array
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		//2nd method
		
		int [] arr2= new int[4];

		arr2[0] = 10;
		arr2[1] = 20;
		arr2[2] = 30;
		arr2[3] = 30;
		
		System.out.println(arr[0]);  //10
		System.out.println(arr[2]);  //30
		
		// 3rd method
		
		int [] arr3= {10,20,30,40};
		
		// print values of vairbale
		System.out.println(a);
		
		// print values of an array
		
		System.out.println(arr3[1]);  // 20
		
		System.out.println(arr3[3]);  //40
		
		// How to print all the values of an array
		
		int [] arr4= {100,200,300,400};
		
		for(int i=0;i<4 ;i++)
		{
			System.out.println("printing values of an array");
			System.out.println(arr4[i]);
		}
		
		// Multi Dimensional Array
		
		
		String [][] arr5= {{"1","2","3","4"},{"sonal","mittal","selenium","abc"},{"x","1","batch","23"}};
		
		// print the values of this array arr5
		
		// Use 2 for loops  ---> 1 loop for parent, 1 loop for child
		
		// 1 loop for moving inside my parent loop
		
		for(int i=0; i<3;i++)  // i =2
		{
			for(int j=0;j<4;j++)  // j=0
			{
				
				System.out.println(arr5[i][j]);  // arr5[2][0]  //x,1,batch,23
			}
			
		}
		

		
		  int[] [] [] arr7 = {{{1,2,3,4},{0,9,1},{3,5,7},{8,1,3}},{{1,2,3,4},{0,9,1},{3,5,7},{8,1,3}}};



		

		  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
