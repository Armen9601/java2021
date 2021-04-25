package dynamicArray;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        for (int i = 0; i < 13; i++) {
            da.add(i);
        }
        int byIndex = da.getByIndex(10);
        System.out.println(byIndex);
        da.print();


    }

}

