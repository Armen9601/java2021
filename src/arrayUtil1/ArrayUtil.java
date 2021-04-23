package arrayUtil1;

public class ArrayUtil {





    void length(int[]array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    void maximum(int[]array) {

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println("the maximum number = " + max);
    }
    void minimum(int[]array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println("the minimum number = " + min);
    }
    void oddNumbers(int[]array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    void evenNumbers(int[]array){
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 0)
                System.out.print(array[j] + " ");
        }
        System.out.println();
    }
    void oddEvenCount(int[]array){
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                x++;
        }
        System.out.println("zuygeri tivy = " + x);
        System.out.println("kenteri tivy = " + (array.length - x));
    }
    void average(int[]array){
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
        }
        System.out.println(result / array.length);
    }
}
