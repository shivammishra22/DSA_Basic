import java.util.Scanner;
import java.util.Arrays;

public class ArrayDeletion4 {
	public static void main(String[] args) {
		Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the array Size:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int newarr[] = new int[arr.length - 1];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the array Value:");
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the value :");
		int x = sc.nextInt();

		boolean flag = false;
		for (int i : arr) {
			if (i == x) {
				flag = true;
				break;
			}

		}
		if (flag) {

			for (int i = 0; i < arr.length - 1; i++) {
				if (flag && arr[i] != x) {
					newarr[i] = arr[i];

				} else {
					flag = false;
					newarr[i] = arr[i + 1];

				}

			}
			arr = newarr;
			System.out.println("New array is :" + Arrays.toString(arr));
		} else {
			System.out.println("Element not find in arr");
		}

	}

}
