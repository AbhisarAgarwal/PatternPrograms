package Pattern;

public class Pattern15 {
    public static void main(String[] args) {
        int size = 6;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i<j) System.out.print("*");
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
//        for (int i = 0; i <size ; i++) {
//            for (int j = 0; j <=i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j <size-i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
