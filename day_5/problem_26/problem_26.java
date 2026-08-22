import java.util.*;

class problem_26 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s =  sc.nextLine();
        String reverse = "";
        for(int i = s.length()-1; i >= 0;i--){
            reverse += s.charAt(i);
        }
        if(reverse.equals(s))
            System.out.println("The string " + s + " is a palindrome");
        else
            System.out.println("The string " + " s " + " is not a palindrome");
    }    
}
