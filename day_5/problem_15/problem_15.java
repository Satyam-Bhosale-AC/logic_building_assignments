import java.util.*;

class problem_15{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pattern length ");
        int n = sc.nextInt();
        int row;
        for(int i=1; i<= 2*n-1 ; i++){
            if(i <=n)
                row = i;
            else
                row = (2 * n) - i + 1;
            for(int j=1; j <= 2 * row -1 ; j++){
                if(j%2!=0)
                    System.out.print(row);
                if(j%2==0)
                    System.out.print("*");
            }
            System.out.println();
        }
        
        
    }
}