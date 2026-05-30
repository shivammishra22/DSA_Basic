
public class ArraySearchValue1 {
	public static void main(String[] args) {
		int arr[]= {11,23,14,16,74,2,};
		int x=14;
		boolean flag=false;
				
		for (int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("Valur Found!");
		}
		else {
				System.out.println("Value not found!");
			}
		}
	}


