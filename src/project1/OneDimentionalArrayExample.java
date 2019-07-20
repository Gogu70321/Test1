package project1;

public class OneDimentionalArrayExample {

	public static void main(String[] args) {
	
int [] arr = new int [5];
//To print even and odd count from Array.
int even=0;
int odd=0;
		
	int[] arr1 = {10,33,43,12,45,33,66,26,16,14,22,20};
	
	for(int i = 0; i<arr1.length; i++) {
		
			if(arr1[i]%2 == 0) {
				
				even++;
				
			}else {
				
				odd++;
			}		
	}		
	System.out.println(even);
	System.out.println(odd);
	}		
		
	}

