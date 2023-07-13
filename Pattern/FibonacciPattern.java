package Pattern;

public class FibonacciPattern {
    public static void main(String[] args) {
        int size = 4;
        int first =0;
        int second =1;
        int temp =0;

        for(int i = 0; i < size; i++) {
            //print space
            for (int j = 0; j < size - i; j++){
                System.out.print(" ");

            }
            //print stars
            for (int j = 0; j <= 2 * i; j++) {
              if (j==0)
                  System.out.print(0+" ");
              else if (j==1)
                  System.out.print(1+" ");
            else {
                  System.out.print(first+second+" ");
                  temp= first+second;
                  first = second;
                  second = temp;
              }
            }

            System.out.println();
        }
    }

}
/*
 num1= 0
 num2= 1
 fibo = num1+num2 : 1
 num1= num2
 num2=sum
*/
