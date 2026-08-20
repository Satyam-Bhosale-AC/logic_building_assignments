import java.util.*;

class problem_3 {

    static void printEvenNumbers(){
        int i = 2;
        while(i <= 50 ){
            if(i%2==0){
                System.out.print(i+ " ");
            }
            
            i++;
        }
    }
    public static void main(String args[]){
        printEvenNumbers();
    }
}