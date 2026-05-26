import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeletion3 {
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
		System.out.println("Enter the index value");
//		int []arr= {1,2,3};

//		System.out.println("enter the value to be inserted:");
//		int value = sc.nextInt();
//		System.out.println("Enter the index");
		int index = sc.nextInt();
		if (index < 0 || index >= arr.length) {
			System.out.println("Index is out of array size!");
		} else {
			int newArr[] = new int[arr.length + 1];
//			newArr[index] = value;
			for (int i = 0; i < arr.length; i++) {
				if (i < index) {
					newArr[i] = arr[i];
				} else {
					newArr[i] = arr[i+1];
				}
			}
			arr = newArr;
			System.out.println(Arrays.toString(arr));
		}

	}
}
