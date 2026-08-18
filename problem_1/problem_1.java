import java.util.*;
class problem_1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in Maths out of 100: ");
        int maths = sc.nextInt();
        System.out.println("Enter your marks in Science out of 100: ");
        int science = sc.nextInt();
        System.out.println("Enter your marks in History out of 100: ");
        int history = sc.nextInt();
        int average = (maths + science + history)/3;
        if(average >= 90){
            System.out.println("Grade A");
        } else if(average < 89 && average >=70){
            System.out.println("Grade B");
        } else if(average < 69 && average >= 50) {
            System.out.println("Grade C");
        } else if(average < 49 && average >=30) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }
    }
}