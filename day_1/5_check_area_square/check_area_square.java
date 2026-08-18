
import java.util.*;
class check_area_square {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side length: ");
		int n = sc.nextInt();
        int area= n*n;
        if(n>0){
            System.out.println("Area of square is: " + area);
        } else {
            System.out.println("Invalid input");
        }
	sc.close();
	}
}
 