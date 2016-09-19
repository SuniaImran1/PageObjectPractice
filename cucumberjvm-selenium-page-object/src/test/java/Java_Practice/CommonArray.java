package Java_Practice;

public class CommonArray {

	public static void main(String[] args) {
		// Find the common elements in the Array
		int[] array1 = { 1, 2, 3, 4, 5, 6 };
		int[] array2 = { 2, 3, 4, 7, 8, 90 };
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					System.out.println(array1[i]);

				}

			}
		}
		// Iterating through an Array

		String[] stringArray = new String[10];
		for (int x = 0; x < stringArray.length; x++) {
			stringArray[x] = "String no " + x;

		}
		for (int x = 0; x < stringArray.length; x++) {
			System.out.println(stringArray[x]);
		}

		// Iterating a Multidimensional Arrays

		int[][] intArray = new int[2][3];
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray.length; j++) {
				System.out.println("i:" + i + ", j: " + j);

			}
		}
		// Iterating elements through an Array
		int[] ints = new int[20];
		int InsertIndex = 10;
		int newValue = 20;
		// Move elements below insertion point
		for (int i = ints.length - 1; i > InsertIndex; i--) {
			ints[i] = ints[i - 1];
		}
		// insert new value
		ints[InsertIndex] = newValue;

	}}
