import java.util.*;
class problem_2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year to check whether its a leap year or not: ");
        int leap = sc.nextInt();
        if((leap%4 == 0 && leap %100 != 0) || leap % 400 ==0){
            System.out.println("It's a leap year");
        } else {
            System.out.println("It's not a leap year");
        }
    }
}