
public class ArraySearchValue3 {
	public static void main(String[] args) {
		int arr[]= {11,23,14,16,14,74,2,};
		int x=14;
		int count=0;
		String index="";
		
				
		for (int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				
				count+=1;
				index+=i+" ";
				
			}
		}
		if(count==0) {
			System.out.println("Valur Not Found!");
		}
		else {
				System.out.println(x+ " found "+count+" times at index "+index);
			}
		}
	}


