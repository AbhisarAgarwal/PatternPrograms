package Pattern;

public class Pattern9 {
    public static void main(String[] args) {
        int size=4;
        for (int i = 0; i < size; i++) {
            int num =1;
            for (int j = 0; j <size-i; j++) {
                System.out.print(num++);
            }
            System.out.println("   ");
        }
    }
}
