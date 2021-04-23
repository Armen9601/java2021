package arrayExamples1;

public class ArrayExamples {


    void repeatable( int[] array,int n) {
        int x =n ;
        boolean b = false;
        for (int i = 0; i < array.length; i++) {
            if (n == array[i]) {
                b = true;
            }
        }
        System.out.println(b + " " + x);
    }

    void IsIndexExists( int[] array,int m) {
        int y = m;
        boolean n = false;
        for (int i = 0; i < array.length; i++) {
            if (m == array[i]) {
                m = i;
                n = true;
            }
        }
        System.out.println(n ? "index " + y : "eror " + -1);
    }

    void index( int[] array,int m) {
        int y = m;
        boolean n = false;
        for (int i = 0; i < array.length; i++) {
            if (m == array[i]) {
                y = i;
                n = true;
            }
        }
        System.out.println(array[y]);
    }

    void repeat( int[] array) {
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
    }

    void sorting( int[] array) {
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
