import java.util.*;

class problem_23{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pattern length ");
        int n = sc.nextInt();
        int row;
        for(int i=1; i<=(2*n)+1 ; i++){
            if(i<=n+1){
                row = i;
            } else {
                row = (2 * n) - i +2;
            }
            for(int j = row; j<=n;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<= row;j++){
                System.out.print("*");
            }
            for(int j = 1; j< row;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
        
    }
}