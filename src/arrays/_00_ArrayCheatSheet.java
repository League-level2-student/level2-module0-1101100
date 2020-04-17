package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	static Random ran = new Random();
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String [] a = {"a1","a2","a3","a4","a5"};
		//2. print the third element in the array
		System.out.println(a[3]);
		//3. set the third element to a different value
		a[3]="a33";
		//4. print the third element again
		System.out.println(a[3]);

		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (String printa : a) {
			System.out.println(printa);
		}
		
		//6. make an array of 50 integers
		int [] oddNums = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < oddNums.length; i++) {
			
			oddNums[i] = ran.nextInt(50);
				
		}
		//8. without printing the entire array, print only the smallest number in the array
		
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	}
}
