package arrayExamples1;

public class ArrayExamples {


    void repeatable(int[] array, int n) {
        boolean b = false;
        for (int i = 0; i < array.length; i++) {
            if (n == array[i]) {
                b = true;
            }
        }
        System.out.println(b + " " + n);
    }

    void IsIndexExists(int[] array, int m) {
        boolean n = false;
        for (int i = 0; i < array.length; i++) {
            if (m == array[i]) {
                m = i;
                n = true;
            }
        }
        System.out.println(n ? "index " + m : "error " + -1);
    }

    void index(int[] array, int y) {
        boolean n = false;
        for (int i = 0; i < array.length; i++) {
            if (y == array[i]) {
                y = i;
                n = true;
            }
        }
        System.out.println(array[y]);
    }

    void repeat(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("krknvum en: " + array[i]);
                }
            }


        }
    }

    void sorting(int[] array) {
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
