import java.util.*;

class problem_31{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "hello";

        boolean check1 = (s3 == s1  && s2 ==s1);
        
        System.out.println("all strings point to same obj : " + check1);
    }    
}
