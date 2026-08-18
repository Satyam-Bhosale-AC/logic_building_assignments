
import java.util.*;
class check_area_rectangle {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length: ");
		int n = sc.nextInt();
        System.out.println("Enter breadth: ");
		int m = sc.nextInt();
        double area= m*n;
        if(n>0 && m>0){
            System.out.println("Area of rectangle is: " + area);
        } else {
            System.out.println("Invalid input");
        }
	sc.close();
	}
}
 