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
        for (i = 0, j = bolola1.length - 1; i < j - 1; i++, j--) {

        }
        System.out.print(bolola1[i]);
        System.out.print(bolola1[j]);
        System.out.println();
// true || false
        char[] bolola2 = {'b', 'o', 'l', 'o', 'l', 'a'};
        int k = bolola2.length - 1;
        boolean b = false;
        if (bolola2[k] == 'y'&& bolola2[k - 1] == 'l'){
            b = true;}
        System.out.println(b);


//true bob
        char[] babola = {'b', 'a', 'b', 'o', 'l', 'a'};
        boolean bob = false;
        for (int l = 0; l < babola.length - 2; l++) {
            if (babola[l] == babola[l + 2]) {
                bob = true;
            }

        }
        System.out.println(bob);
// barev
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        for (int l = 0; l < text.length; l++) {
            if (text[l] != ' ')
                System.out.print(text[l]);

        }
    }

}

