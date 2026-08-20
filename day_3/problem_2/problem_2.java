import java.util.*;

class problem_2{
    static void checkAgeCategory(int age){
        if(age >= 18 && age < 60) {
            System.out.println("You are an Adult");
        } else if(age >= 60){
            System.out.println("You are a Senior Citizen");
        }else {
            System.out.println("You are a Minor");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        checkAgeCategory(age);
        sc.close();
    }
}