import java.util.Arrays;
public class ArrayMAx {
		public static void main(String[] args) {
			int arr[]= {2,12,3,4,5};
			int m=arr[0];
			for (int i=1;i<arr.length;i++) {
				if(arr[i]>m) {
					m=arr[i];
				}
				
			}
			System.out.println("Maxx value of the array is "+m);
		}

}
