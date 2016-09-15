package Java_Practice;

public class Arrayspractice {

	public static void main(String[] args) {

//display all the elements of the list
		double[] mylist = {1,2,3,4,5,6,7,8};
	
		/*	for (int i = 0; i< mylist.length; i++){
			System.out.println("List is " + mylist[i]);
			}*/
		
		//or can be done using another method
		
		for (double element: mylist){
			System.out.println(element);
		}
					
	}
		
		
		
	}


