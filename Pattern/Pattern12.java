package Pattern;

public class Pattern12 {
    public static void main(String[] args) {
        int size = 4;

        for (int i = 0; i < size; i++) {
            //print space
            for (int j = 0; j < size-i; j++)
                System.out.print(" ");
            //print stars
            for (int j = 0; j <=i; j++)
                System.out.print("*");
            //print stars
                for (int j = 1; j <=i; j++)
                System.out.print("*");

            System.out.println();
        }

    }
}




