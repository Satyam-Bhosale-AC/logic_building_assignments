import java.util.*;

class problem_17{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pattern length ");
        int n = sc.nextInt();
        for(int i=1; i<=n ; i++){
            
            for(int j=1;j<=2*i -1;j++){
                if(j%2!=0){
                    System.out.print(j);  
                    
                }
                    
                if(j%2==0)
                    System.out.print("*");
                    
                
            }
            
            System.out.println();
        }
        sc.close();
        
    }
}