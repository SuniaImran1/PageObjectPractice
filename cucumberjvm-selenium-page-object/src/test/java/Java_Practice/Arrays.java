package Java_Practice;

//Example of how to create initialize and process Array
public class Arrays {

	public static void main(String[] args) {
		// create an Array with elements
		double[] mylist = { 1.9, 2.9, 3.4, 3.5 };
		// Print all the array elements
		for (int i = 0; i < mylist.length; i++) {
			System.out.println(mylist[i] + " ");
		}
		// summing all the elements
		double total = 0;
		for (int i = 0; i < mylist.length; i++) {
			total = mylist[i];
		}
		System.out.println("total is " + total);
		// Finding the largest element
		double max = mylist[0];
		for (int i = 1; i < mylist.length; i++) {
			if (mylist[i] > max)
				max = mylist[i];

		}
		System.out.println("Max is " + max);
	}

}
