package Pattern;

public class Pattern10 {
    public static void main(String[] args) {
        int size = 4;
        for (int i = 0; i <size; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(" * ");
            }
            System.out.println("   ");
        }
        for (int i = 0; i <size+1; i++) {
            for (int j = 0; j <size+1-i; j++) {
                System.out.print(" * ");
            }
            System.out.println("   ");
        }

    }
}
