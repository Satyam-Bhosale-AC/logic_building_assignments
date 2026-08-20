import java.util.*;

class bonus{

    static void choiceone(Scanner sc){
        System.out.println("Enter your marks in Maths out of 100: ");
        double maths = sc.nextDouble();
        System.out.println("Enter your marks in Science out of 100: ");
        double science = sc.nextDouble();
        System.out.println("Enter your marks in History out of 100: ");
        double history = sc.nextDouble();
        double average = (maths + science + history)/3;
        System.out.println("Average is: "+average);
        if(average >= 90){
            System.out.println("Grade A");
        } else if(average <= 89 && average >=70){
            System.out.println("Grade B");
        } else if(average <= 69 && average >= 50) {
            System.out.println("Grade C");
        } else if(average <= 49 && average >=30) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }
    }

    static void choicetwo(Scanner sc){
        System.out.println("Enter year to check whether its a leap year or not: ");
        int leap = sc.nextInt();
        if((leap%4 == 0 && leap %100 != 0) || leap % 400 ==0){
            System.out.println("It's a leap year");
        } else {
            System.out.println("It's not a leap year");
        }
    }


    static void choicethree(Scanner sc){
        System.out.println("Enter number between 1 to 7 : ");
        int n = sc.nextInt();
        switch (n) {
            case 1: 
                System.out.println("Monday");
                break;
            case 2: 
                System.out.println("Tuesday");
                break;
            case 3: 
                System.out.println("Wednesday");
                break;
            case 4: 
                System.out.println("Thursday");
                break;
            case 5: 
                System.out.println("Friday");
                break;
            case 6: 
                System.out.println("Saturday");
                break;                
            case 7: 
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
        }
    }
    
    static byte b;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static char c;
    static boolean bool;

    static void choicefour(){
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int c;
        do{
            System.out.println("Enter your choice: ");
            System.out.println("1 - Grade Evaluation");
            System.out.println("2 - Leap year check");
            System.out.println("3 - Day of the week");
            System.out.println("4 - Identify default value");
            System.out.println("5 - Exit");
            c = sc.nextInt();
            switch(c){
                case 1 : {
                    choiceone(sc);
                    break;
                }
                case 2: {
                    choicetwo(sc);
                    break;
                }
                case 3: {
                    choicethree(sc);
                    break;
                }
                case 4 :{
                    choicefour();
                    break;
                }
                case 5 : {
                    System.out.println("Exiting");
                    break;
                }
                default : {
                    System.out.println("Invalid choice");
                }
            }
        } while(c != 5);
        sc.close();
    }
}