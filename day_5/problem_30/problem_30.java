import java.util.*;

class problem_30 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = "hello";
        String s2 = s1.intern();
        String s3 = "hello";

        boolean check1 = (s3 == s2);
        
        System.out.println("is s3 and s2 pointing towards same : " + check1);
    }    
}
