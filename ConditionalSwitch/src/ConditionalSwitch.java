import java.util.Scanner;
//public class ConditionalSwitch{
//    public static void main(String[] args){
//        //Conditional Statement - SWITCH
//week days
//        int day = 2 ; // 1- mon , 2 - Tue , 3 - Wed etc.
//        switch(day){
//            case 1 :
//                System.out.println("monday");
//                break;
//            case 2:
//                System.out.println("tuesday");
//                break;
//            case 3:
//                System.out.println("wed-sun");
//        }
//    }
//}
//perform basic arithmetic operations
//public class ConditionalSwitch{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter first No: ");
//        double num1 = sc.nextDouble();
//        System.out.println("Enter Second No: ");
//        double num2 = sc.nextDouble();
//        System.out.println("Enter Operator like (+ , - , / , *) : ");
//        char op = sc.next().charAt(0);
//        double result;
//        switch (op){
//            case '+' :
//                result = num1 + num2;
//                System.out.println("Result: " + result);
//                break;
//            case '-':
//                result = num1 - num2;
//                System.out.println("Result: " + result);
//                break;
//            case '*':
//                result = num1 * num2;
//                System.out.println("Result: " + result);
//                break;
//            case '/':
//                if(num2 != 0) {
//                    result = num1 / num2;
//                    System.out.println("Result: " + result);
//                } else {
//                    System.out.println("Error: Division by Zero");
//                }
//                break;
//            default:
//                System.out.println("Invalid Operator");
//        }
//    }
//}
//
import java.util.Scanner;

public class ConditionalSwitch {
    public static void main(String[] args) {
        //Vowel Checker
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter alphabet Letter : ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("It's a vowel.");
                break;
            default:
                if (Character.isLetter(ch))
                    System.out.println("It's a consonant.");
                else
                    System.out.println("Invalid input. Please enter an alphabet.");
        }
    }
}


