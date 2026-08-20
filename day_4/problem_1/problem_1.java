import java.util.*;

class problem_1{
    static int sumOfTwoNumbers(int a,int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sumOfTwoNumbers(a,b);
        System.out.println("sum : " + sum);
        sc.close();
    }
}