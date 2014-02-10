package oracle.certified.associate.arrays;

import java.util.Arrays;

/**
 * Demonstrates arrays in Java language.
 * 
 * An array is a container object that holds a fixed number of values of a single type.
 * The length of an array is established when the array is created.
 * After creation, its length is fixed.
 * 
 *  In Java, arrays are objects. Arrays can be of primitive data types or reference types.
 *  In the former case, all elements in the array are of a specific primitive data type. In
 *  the latter case, all elements are references of a specific reference type. References in
 *  the array can then denote objects of this reference type or its subtypes. Each array
 *  object has a final field called length, which specifies the array size, i.e., the number
 *  of elements the array can accommodate. The first element is always at index 0 and
 *  the last element at index n-1, where n is the value of the length field in the array.
 * 
 */
public class JavaArraysDemo {
	public static void main(String[] args) {
		//	An array variable that is declared as a member of a class,
		//	but is not initialized to any array, will be initialized
		//	to the default reference value null. This default initialization
		//	does not apply to local reference variables and, therefore, does not apply to
		//	local array variables either. This should not be confused with
		//	initialization of the elements of an array during array construction.
		
		int[] tab1;
		String tab2[];
		
		int[] tab3, tab4;			// Here we have two references representing arrays 
		int tab5[], simpleValue;	// Here we have one reference representing array and one simple int value
		
		//	One-dimension arrays can be declared as follows:
		//	----------------------------------------------------------------------------------------
		//	<array name> = new <element type> [<array size>];
		//	----------------------------------------------------------------------------------------
		//	The minimum value of <array size> is 0, in other words, zero-length arrays can be
		//	constructed in Java. If the array size is negative, a NegativeArraySizeException is thrown.
		//	The value of the field length in each array is set to the number of elements specified
		//	during the construction of the array.
		//	When the array is constructed, all its elements are initialized to the default value for
		//	<element type>. This is true for both member and local arrays when they are constructed.
		//	----------------------------------------------------------------------------------------
		tab1 = new int[10];			// tab1 holds 10 values of 0's as default when constructed
		// tab2 = { "One", "Two"};	// Array constants can only be used in initializers
		tab2 = new String[]{ "One", "Two"};
		System.err.println(Arrays.toString(tab1));
		System.err.println(Arrays.toString(tab2));
		
		//	Multidimensional arrays can be declared as follows:
		//	----------------------------------------------------------------------------------------
		//	<element type>[][]...[] <array name>;
		//	<element type> <array name>[][]...[];
		//	----------------------------------------------------------------------------------------
		int[][] mtab1 = new int[3][3];	// 2-dimensional array
		int mtab2[][] = new int[3][3];	// 2-dimensional array
		int[] mtab3[] = new int[3][3];	// 2-dimensional array
		
		int mtab4[][] = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		String[][] raggedArray = {
			{ "One", null, "Two" },		// 1. row is an array of 3 elements.
			{ null, "Three"},			// 2. row is an array of 2 elements.
			new String[1],				// 3. row is an array of 1 element.
			{}, 						// 4. row is an array of 0 elements.
			null 						// 5. row is not constructed.
		};
		
		// In multidimensional arrays only the leftmost size is required
		int[][] mtab5 = new int[2][];
		int[][][] mtab6 = new int[2][][];
		//	int[][][] wrong1 = new int[][2][];
		//	int[][][] wrong2 = new int[][][2];
		
		Object o1 = new Object();
		Object o2 = new Object();
		Object[] a1 = { o1, o2 };
		Object[] a2 = { o1, o2 };
		
		// array1.equals(array2) is the same as array1 == array2, i.e. is it the same array.
		// Arrays.equals(array1, array2) compares the contents of the arrays.
		System.out.println("1. Check for equality: " + a1.equals(a1));			// prints true
		System.out.println("2. Check for equality: " + a1.equals(a2)); 			// prints false
		System.out.println("3. Check for equality: " + Arrays.equals(a1, a2));	// prints true
		
		// -----------------------------------------------------------------------------------------
		int[] primeNumbers1 = new int[5];
		primeNumbers1[0] = 2;
		primeNumbers1[1] = 3;
		primeNumbers1[2] = 5;
		primeNumbers1[3] = 7;
		primeNumbers1[4] = 11;
		
		int[] primeNumbers2 = {2, 3, 5, 7, 11};
		int[] primeNumbers3 = new int[] {2, 3, 5, 7, 11};
		int primeNumbers4[] = {2, 3, 5, 7, 11};					// Valid but discouraged
		int[] primeNumbers5 = {2, 3, 5, 7};
		int[] primeNumbers6 = {2, 3, 5, 7, 11, 13};
		// int[] invalidArray = new int[5] {2, 3, 5, 7, 11};	// Invalid (Cannot define dimension expressions when an array initializer is provided)
		
		System.out.println("4. Check for equality: " + areTheSame(primeNumbers1, primeNumbers2));
		System.out.println("5. Check for equality: " + areTheSame(primeNumbers1, primeNumbers3));
		System.out.println("6. Check for equality: " + areTheSame(primeNumbers1, primeNumbers4));
		System.out.println("7. Check for equality: " + areTheSame(primeNumbers1, primeNumbers5));
		System.out.println("8. Check for equality: " + areTheSame(primeNumbers1, primeNumbers6));
		
		int[] primeNumbers7 = new int[5];
		
		System.out.println("Before copy: " + Arrays.toString(primeNumbers7));
		System.arraycopy(primeNumbers1, 0, primeNumbers7, 0, 5);
		System.out.println("After copy:  " + Arrays.toString(primeNumbers7));
	}
	
	private static boolean areTheSame(int[] first, int[] second) {
		return Arrays.equals(first, second);
	}
}
