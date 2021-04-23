package homework;

public class CharArray {
    void repeatable( char[] bolola, char m){
        int x = 0;
        char c = m;
        for (int i = 0; i < bolola.length; i++) {
            if (c == bolola[i])
                x++;
        }
        System.out.println(x);
    }
    void middlePrint( char[] bolola){
        int i, j;
        int middle = (bolola.length - 1) / 2;

        System.out.print(bolola[middle]);
        System.out.print(bolola[middle + 1]);

        System.out.println();
    }
    void endLy( char[] bolola,char m,char n){

        int k = bolola.length - 1;
        boolean b = false;
        if (bolola[k] == m && bolola[k - 1] == n) {
            b = true;
        }
        System.out.println(b);
    }
    void bob( char[] bolola){
        boolean isBob = false;
        char bob = 'b';
        for (int l = 0; l < bolola.length; l++) {
            if (l + 2 < bolola.length && bolola[l] == bob && bolola[l + 2] == bob) {
                isBob = !isBob;
                break;
            }
        }
        System.out.println(isBob);
    }
    void space(char[] text){
        int firstIndex = 0;
        int lastIndex = 0;
        for (int l = 0; l < text.length; l++) {
            if (text[l] != ' ') {
                firstIndex = l;
                break;
            }
        }
        for (int m = text.length - 1; m > 0; m--) {
            if (text[m] != ' ') {
                lastIndex = m + 1;
                break;
            }
        }
        int resultLength = lastIndex - firstIndex;
        char[] result = new char[resultLength];
        for (int l = 0; l < resultLength; l++) {
            result[l] = text[firstIndex + l];
            System.out.print(result[l]);

        }
    }
}
