package arrayexamplessclass;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        int[] array = {2, 15, 15, 37, 7800, 68158, 87, 19878481, 37, 1};
        int x = 15;
        boolean b = false;
        for (int i = 0; i < array.length; i++) {
            if (x == array[i]) {
                b = true;
            }
        }
        System.out.println(b + " " + x);

        int y = 4;
        boolean n = false;
        for (int i = 0; i < array.length; i++) {
            if (y == array[i]) {
                y = i;
                n = true;
            }
        }
        System.out.println(n ? "index " + y : "eror " + -1);


        System.out.println(array[y]);

        int k = 0;
        int z = 1;
        for (int i = k; i < array.length; i++) {
            int g = array[k];
            for (int j = z; j < array.length; j++) {
                if (g == array[j])
                    System.out.println("krknvum en: " + g);
            }
            k++;
            z++;

        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    int t = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = t;
                }

            }

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }


    }
}



