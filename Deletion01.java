import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeletion {
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
		sc.close();
		
		System.out.println(Arrays.toString(arr));
		int []newArr=new int[arr.length-1];
		for(int i=0;i<arr.length-1;i++) {
			newArr[i]=arr[i];
		}
		arr=newArr;
		System.out.println(Arrays.toString(arr));
	}

}
