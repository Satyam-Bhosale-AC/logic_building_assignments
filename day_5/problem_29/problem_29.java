import java.util.*;

class problem_29 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = "hello";
        String s2 = "world";
        String s3 = s1 + s2;

        boolean check1 = (s3 == s1);
        
        System.out.println("is s3 pointing towards same obj as s1 : " + check1);
    }    
}
