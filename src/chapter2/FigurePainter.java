package chapter2;

public class FigurePainter {
    void figureOne(int m, int n) {
        if (m > n) {
            System.out.println("First number must be grete than second");
        }
        if (m == n) {
            System.out.println("numbers must not  be equal,your number is " + n);
        }
        for (int i = m; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    void figureTwo(int m, int n, char l) {
        for (int i = m; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(l);

            }
            System.out.println();
        }
    }

    void figureThree(int m, int n, char l) {
        for (int i = m; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(l);

            }
            System.out.println();
        }
    }

    void figureFour(int m, int n, char l) {
        for (int i = m; i < n; i++) {
            for (int j = 0; j < i; j++) {

            }

            for (int k = n; k > i; k--) {
                System.out.print(l + " ");

            }
            System.out.println();
        }
    }

    void figureFive(int m, int n, char l) {
        for (int i = m; i < n; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(l + " ");

            }
            System.out.println(" ");
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = 3; k >= i; k--) {
                System.out.print(l + " ");

            }
            System.out.println();
        }
    }
}
