package Pattern;

public class Pattern11 {
    public static void main(String[] args) {
        int size = 4;
        char character ='A';
        char character1 ='a';

        for (int i = 0; i <size; i++)
        {
            for (int j = 0; j <size ; j++) {
               if (j<size-i-1)
                   System.out.print(" ");
               else
                   System.out.print(character++);
            }System.out.println();
        }
    }
}
