import java.util.*;

class problem_7{

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
		for(int i = 0 ; i < n ; i++){
			sum += arr[i]; 
			
		}
        System.out.print("The sum of all numbers is " +sum);
		sc.close();
	}
}