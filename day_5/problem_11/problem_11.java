import java.util.*;

class problem_11{

	public static  void main(String args[]){
    		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements");
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		int positive = 0 , negative = 0;
		for(int i = 0 ; i < n ; i++){
			if(arr[i] > 0)
			positive++;
			
			if(arr[i] < 0)
			negative++;
			
					
		}
		System.out.println("Positive Numbers " + positive);
		System.out.println("Negative Numbers " + negative);
		
		sc.close();
	}
}