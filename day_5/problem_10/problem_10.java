import java.util.*;

class problem_10{

	public static  void main(String args[]){
    		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements");
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		int avg = 0;
		for(int i = 0 ; i < n ; i++){
			sum += arr[i];
			avg = sum / n;		
		}
		System.out.println("The average of element is " +avg);
		sc.close();
	}
}