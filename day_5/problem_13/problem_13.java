import java.util.*;

class problem_13{

	public static  void main(String args[]){
    		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n = sc.nextInt();
		Integer arr[] = new Integer[n];
		System.out.println("Enter array elements");
		
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
        System.out.println("Enter the element you want to search");
		int s = sc.nextInt();
        if(Arrays.asList(arr).contains(s)){
				System.out.println("Found");
			} else {
				System.out.println("Not Found");
			}
		
		sc.close();
	}
}