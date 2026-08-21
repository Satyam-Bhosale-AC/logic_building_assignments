import java.util.*;

class problem_20{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pattern length ");
        int n = sc.nextInt();
        for(int i=1; i<=n ; i++){
            
            for(int j=1;j<=i;j++){
                    System.out.print(i);  
            }
            
            System.out.println();
        }
        sc.close();
        
    }
}