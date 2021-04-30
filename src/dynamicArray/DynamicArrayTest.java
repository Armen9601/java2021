package dynamicArray;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.add(4524);
        da.add(4);
        da.add(16);
        da.add(30);
        da.add(148);
        da.add(57);
        da.add(30);
        da.add(36);
        da.add(43);
        da.add(98);
        da.add(15);
        da.add(30);
        da.add(30);
        da.add(18);
        da.add(654);
        da.add(14);
        da.add(165);
        da.add(30);
        da.add(16);
        da.print();
        int max = da.maximum();
        System.out.println("the maximum number of " + max);
        int min = da.minimum();
        System.out.println("the minimum number of " + min);
        da.deleteByIndex(12);
        da.print();
        da.deleteByValueFirst(30);
        da.print();
        int[] subArray = da.subArray(3);
        for (int i : subArray) {
            System.out.print(i + " ");
        }
        System.out.println();
        da.deleteByValue(30);
        da.print();
    }

}

