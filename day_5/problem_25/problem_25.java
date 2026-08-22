import java.util.*;

class problem_25 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s =  sc.nextLine();
        int count = 0;
        for(int i = 0; i <=s.length()-1;i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u'){
                count++;
            }
        }
        System.out.println("The number of vowels are: " +count);
    }    
}
