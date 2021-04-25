package chapter2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FigurePainterTests {
    public static void main(String[] args) {
        FigurePainter fp = new FigurePainter();

        Scanner scanner = new Scanner(System.in);
        try {

            int start = scanner.nextInt();
            int rowCount = scanner.nextInt();
            fp.figureOne(start, rowCount);

        } catch (InputMismatchException e) {
            System.out.println("please use only numeric values");
        }
        fp.figureTwo(1, 4, '#');
        fp.figureThree(0, 9, '$');
        fp.figureFour(0, 5, '+');
        fp.figureFive(0,5,'@');

    }
}
