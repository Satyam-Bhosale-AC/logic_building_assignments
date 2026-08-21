import java.util.*;

class problem_9{

	public static  void main(String args[]){
    		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements");
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		int largest = arr[0];
		for(int i = 0 ; i < n ; i++){
			if(largest < arr[i])
				largest = arr[i];
		}
		System.out.println("The largest element is " +largest);
		sc.close();
	}
}