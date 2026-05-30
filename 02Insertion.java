// Insert the value in the begging of the arr
import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsertion2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter Array Size:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter Array Value");
			arr[i] = sc.nextInt();
		}
		System.out.println("enter the value to be inserted:");
		int value=sc.nextInt();
		// int [0]newArr=values;
		
		
		int []newArr=new int[arr.length+1];
		for(int i=0;i<arr.length;i++)
		{
			newArr[i+1]=arr[i];
		}
		newArr[0]=value;
		arr=newArr;
		System.out.println(Arrays.toString(arr));
		sc.close();

	}

}
