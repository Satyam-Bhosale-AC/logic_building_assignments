import java.util.*;

class problem_5{
    static void printMultiplicationTable(int n){
        for(int i=1 ; i <= 10; i++){
            System.out.println(n + " X " + i + " = " +i*n);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. ");
        int n = sc.nextInt();
        printMultiplicationTable(n);
    }
}