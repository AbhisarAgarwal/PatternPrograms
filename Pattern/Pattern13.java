package Pattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pattern13 {
    public static void main(String[] args) {

        int size = 4;

        for(int i = 0; i < size; i++) {
            //print space
            for (int j = 0; j < size-i; j++)
                System.out.print(" ");
            //print stars
            for (int j = 0; j <=2*i; j++)
                System.out.print("*");

            System.out.println();
        }
    }
    }

