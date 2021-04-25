package chapter2;

public class Homework1 {
    static void drawTriangle(int n, int m, char l) {
        for (int i = m; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(l);

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {

            drawTriangle(i, 0, '&');
        }


    }
}
