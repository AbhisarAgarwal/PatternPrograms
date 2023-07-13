package Pattern;

public class Pattern7 {
    public static void main(String[] args) {
        int size = 5;
        char character = 'A';
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print(character++ + " ");
            }
            System.out.println();
        }
    }
}
