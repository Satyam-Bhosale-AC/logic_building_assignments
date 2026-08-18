
import java.util.*;
class check_positive{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		if(n>0){
			System.out.println("Positive Number");
		} else{
			System.out.println("Not a positive number");
		}
	sc.close();
	}
}
