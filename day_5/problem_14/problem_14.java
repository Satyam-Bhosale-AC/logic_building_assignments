import java.util.*;

class problem_14{

	public static  void main(String args[]){
    		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements");
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element you want to search");
		int s = sc.nextInt();
		int index = Arrays.binarySearch(arr, s);
        if(index >= 0 && index <= n){
            System.out.println("The number found at index " + s + " is " + index );
        } else {
            System.out.println("Not found");
        }
		
		sc.close();
	}
}