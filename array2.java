import java.util.*;

public class array2 {

	public static void main(String[] args) {
		int[] array1 = new int[5];  //creates an integer array called array1 with 5 elements
		int[] array2 = new int[5]; //creates an integer array called array2 with 5 elements
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 elements of array1: ");   //asks the user to enter the values for array1

		for( int i = 0; i<array1.length; i++) {        //the for loop inserts the entered values into array1

			array1[i]=input.nextInt();
		}
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter 5 elements of array2: ");  //asks the user to enter the values for array2

		for( int i = 0; i<array2.length; i++) {     //the for loop inserts the entered values into array2

			array2[i]=input2.nextInt();
		}
		
		if(equals(array1,array2)==true) {         //if the equals method returns true, then "Two lists are strictly identical." is printed
			System.out.println("Two lists are strictly identical.");
		}
		else {                                   //if the equals method returns false, then "Two lists are not strictly identical." is printed
			System.out.println("Two lists are not strictly identical.");
		}
			
	}
	
	
	public static boolean equals(int[] array1, int[] array2) {         //the boolean method "equals" is created to take in two integer arrays
		boolean equal = true;                                           //the boolean variable equal is set to the value true
		for(int j = 0; j<array1.length; j++) {           
			if(array1[j]!=array2[j]) {                   //each value in array1 is compared to array2
				equal = false;                           //if any of the values in the two arrays do not match, the method returns false
			}
		}
		return equal;                              //if the arrays are equal, then the method will return true
	}

	}

//Sample Run
//Enter 5 elements of array1: 1 2 3 4 5
//Enter 5 elements of array2: 1 2 3 4 5
//Two lists are strictly identical.
