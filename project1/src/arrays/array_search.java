package arrays;
import java.util.Arrays;   

public class array_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};  
		//invoking sort() method of the Arrays class  
		Arrays.sort(array);  		
		System.out.println("Elements of array sorted in ascending order: ");  
		//prints array using the for loop  
		for (int i = 0; i < array.length; i++)   
		{       
			System.out.println(array[i]);   
		}
		String s1= "abc";
		String s2 = "def";
		System.out.println(s1.compareTo(s2));

	}
}
