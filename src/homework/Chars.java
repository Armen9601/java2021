package homework;

public class Chars {
    public static void main(String[] args) {
        //how much 'o' is there
        int x = 0;
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        char c = 'o';
        for (int i = 0; i < bolola.length; i++) {
            if (c == bolola[i])
                x++;
        }
        System.out.println(x);
//  characters in the middle
        int i, j;
        char[] bolola1 = {'b', 'o', 'l', 'o', 'l', 'a'};
        int middle = (bolola1.length - 1) / 2;

        System.out.print(bolola1[middle]);
        System.out.print(bolola1[middle + 1]);

        System.out.println();
// true || false
        char[] bolola2 = {'b', 'o', 'l', 'o', 'l', 'a'};
        int k = bolola2.length - 1;
        boolean b = false;
        if (bolola2[k] == 'y' && bolola2[k - 1] == 'l') {
            b = true;
        }
        System.out.println(b);


//true bob
        System.out.println(">>>>>>>>>>>>>>>>>>>>>");

        char[] babola = {'b', 'j', 'b', 'o', 'b', 'a'};
        boolean isBob = false;
        char bob = 'b';
        for (int l = 0; l < babola.length; l++) {
            if (l + 2 < babola.length && babola[l] == bob && babola[l + 2] == bob) {
                isBob = !isBob;
                break;
            }
        }
        System.out.println(isBob);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>");
// barev
        char[] text = {' ', ' ', '5', 'b', ' ', 'a', 'r', ' ', ' ', ' ', 'O', ' ', ' ', ' ', ' ', ' ', ' ', 'e', 'v', ' ', ' '};
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

