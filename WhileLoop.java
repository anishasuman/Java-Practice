//public class WhileLoop {
//1.Pattern Printing
//    public static void main(String[] args) {
//        int i = 1;
//        while (i <= 5) {
//            int j = 1;
//            while (j <= i) {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//    }
//}
//2.Inverted Triangle
public class WhileLoop {
    public static void main(String[] args) {
        int i = 5;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}




