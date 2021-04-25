package dynamicArray;

public class DynamicArray {
    // sa mer himnakan masivn e vortex pahelu enq mer avelacvac arjeqnery
    private int[] array = new int[10];
    // sa mer masivi mej avelacvac elementneri qanankn e
    private int size = 0;

    // stugel ete masivi mej tex chka kanchel extand metody ev avelacnel
    public void add(int value) {
        if (size == array.length - 1) {
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
             value= array[index];
        }
        return value;
    }

    // tpel masivi avelacvac elementnery
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

    }


}