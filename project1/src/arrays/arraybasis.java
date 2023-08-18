package arrays;

public class arraybasis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.println("Element at index " + i + " is "+arr[i]);
		}
		
		// sum of array
		int arr2[] = {1,2,3,4,5};
		int sum = 0;
		for (int i = 0 ; i<arr2.length ; i++)
		{
			sum+=arr2[i];
		}
		System.out.println("Sum = "+sum);
		
		// multidimensional array
		int arr3[][]= {{1,2,3},{4,5,6}};
		for(int i = 0 ; i<arr3.length ; i++)
		{
			for(int j = 0 ; j<arr3[i].length ; j++)
			{
				System.out.print(arr3[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
