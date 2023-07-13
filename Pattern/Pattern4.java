package Pattern;
public class Pattern4 {
    public static void main(String[] args) {
        int size =5;
        int num = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i==0 || i==size-1 || j ==0 || j == size-1){
                    System.out.print(" * ");
                }else
                {
                    System.out.print(" "+ num + " ");
                    num++;
                }
            }
            System.out.println();
        }
    }
}

