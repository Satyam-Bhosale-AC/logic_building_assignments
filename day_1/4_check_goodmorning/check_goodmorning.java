
import java.util.*;
class check_goodmorning {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hour: ");
		int n = sc.nextInt();
		if(n>=5 && n<12) {
			System.out.println("Good Morning");
		} else {
			System.out.println("Not a morning");
		}
	sc.close();
	}
}
 