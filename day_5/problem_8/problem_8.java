import java.util.*;

class problem_8{

	public static  void main(String args[]){
    	Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n = sc.nextInt();
        sc.nextLine();
		String arr[] = new String[n];
		System.out.println("Enter array elements");
		for(int i = 0; i < n; i++){
			arr[i] = sc.next();
		}

		for(int i = 0 ; i < n ; i++){ 
			System.out.println(arr[i]);
		}
		sc.close();
	}
}