package arrayUtil1;

public class ArrayUtilTests {
    public static void main(String[] args) {
        int[] arr = {32, 38, 49, 57, 56, 15, 74, 68, 98, 15765};

        ArrayUtil num = new ArrayUtil();
        num.length(arr);
        num.oddNumbers(arr);
        num.evenNumbers(arr);
        num.oddEvenCount(arr);
        num.minimum(arr);
        num.maximum(arr);
        num.average(arr);

    }
}
