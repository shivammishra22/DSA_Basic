import java.util.Arrays;

public class ArrayReverse {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int n = arr.length;
		for (int i = 0; i < n / 2; i++) {
			int t = arr[i];
			arr[i] = arr[n - 1 - i];
			arr[n - 1 - i] = t;

		}
		System.out.println(Arrays.toString(arr));

	}

}
