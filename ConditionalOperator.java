import java.util.Scanner;
public class ConditionalOperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        if(age<18)
            System.out.println("Ticket price is Rs. 100.");
        else
            System.out.println("Ticket price is Rs. 150.");
    }
}
