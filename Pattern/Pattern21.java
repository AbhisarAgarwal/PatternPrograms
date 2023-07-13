package Pattern;

public class Pattern21 {
    public static void main(String[] args) {
        char ch = 'A';
        for (char i = 'A'; i <='E' ; i++) {
            for (char j = 'A'; j <=i ; j++) {
                System.out.print(""+ch++);
            }
            System.out.println();
        }
    }
}
