package arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {32, 38, 49, 57, 62, 15, 74, 68, 98, 157};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        // tha maximum number
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println("the maximum number = " + max);

        //the minimum number
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println("the minimum number = " + min);
// the odd numbers
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                System.out.print(array[i] + " ");
        }
        System.out.println();
        // the even numbers
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 0)
                System.out.print(array[j] + " ");
        }
        System.out.println();


        int x = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                x++;
        }
        System.out.println("zuygeri tivy = " + x);
        System.out.println("kenteri tivy = " + (array.length - x));
// average
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
        }
        System.out.println(result / array.length);


    }


}



