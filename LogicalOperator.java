
import java.util.Arrays;
import java.util.Scanner;

//public class LogicalOperator {
//    public static void main(String[] args){
//        boolean isAdult = false;
//        if(!isAdult)
//            System.out.println("is adult");
//        else
//            System.out.println("not adult");
//    }
//}
//check whether a number entered by the user is even or odd using if-else
public class LogicalOperator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");//we are taking user input here.
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println(num + " is an even number.");
        }else{
            System.out.println(num + " is an odd number.");
        }
    }
}