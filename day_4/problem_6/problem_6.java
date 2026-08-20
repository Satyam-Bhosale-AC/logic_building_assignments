import java.util.*;

class problem_6{

    static void calculateSum(int n){
        int sum = 0;
        for(int i = 1 ; i <= n;i++){
            sum += i;
        }
        System.out.println("The sum of numbers from 1 to " + n + " is " + sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int n = sc.nextInt();
        calculateSum(n);
        sc.close();
    }
}