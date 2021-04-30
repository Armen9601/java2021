package dynamicArray;

public class DynamicArray {
    // sa mer himnakan masivn e vortex pahelu enq mer avelacvac arjeqnery
    private int[] array = new int[10];
    // sa mer masivi mej avelacvac elementneri qanankn e
    private int size = 0;


    // stugel ete masivi mej tex chka kanchel extand metody ev avelacnel
    public void add(int value) {
        if (size > array.length - 1) {
            extend();
        }
        array[size] = value;
        size++;
    }


    //stexcel hin masivic  10 element aveli mec masiv
    //qcel hin masivi elementnery nwri mej
    //hin masivi hxumy kapel nori het
    private void extend() {
        int[] arr = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }
        array = arr;

    }

    // ete trvac indexy mer masivi indexi sahmannerum e
    // veradarcnel masivi index - erord elementy else -1
    public int getByIndex(int index) {
        int value = -1;
        if (index < array.length) {
            value = array[index];
        }
        return value;
    }

    // tpel masivi avelacvac elementnery
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    // the maximum number
    public int maximum() {
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
//the minimum number

    public int minimum() {
        int min = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public void deleteByIndex(int index) {
        int[] arr1 = new int[size - 1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i > index - 1 ? array[i + 1] : array[i];
        }
        size--;
        array = arr1;
    }

    public void deleteByValue(int value) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            deleteByValueFirst(value);

        }

    }

    public void deleteByValueFirst(int value) {
        int[] arr = new int[size - 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = array[i];
            if (arr[i] == value) {
                for (int j = i; j < arr.length; j++) {
                    arr[j] = array[j + 1];
                }
                break;
            }
        }
        size--;
        array = arr;
    }

    public int[] subArray(int startIndex, int endIndex) {
        int[] subArray = new int[endIndex - startIndex + 1];
        int j = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            subArray[j] = array[i];
            j++;
        }
        return subArray;
    }

    public int[] subArray(int startIndex) {
        int[] subArray = new int[size - startIndex];
        for (int i = startIndex; i < size; i++) {
            subArray[i - startIndex] = array[i];
        }
        return subArray;
    }
}