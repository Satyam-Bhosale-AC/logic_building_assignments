import java.util.*;

class problem_28 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = new String("hello");
        String s2 = new String("hello");

        boolean check1 = (s1 == s2);
        boolean check2 = (s1.equals(s2));
        System.out.println("Using == : " + check1);
        System.out.println("Using equals : " + check2);
    }    
}
