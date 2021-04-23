package homework;

public class CharArrayTests {
    public static void main(String[] args) {
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        char[] text = {' ', ' ', '5', 'b', ' ', 'a', 'r', ' ', ' ', ' ', 'O', ' ', ' ', ' ', ' ', ' ', ' ', 'e', 'v', ' ', ' '};
        CharArray array=new CharArray();
        array.repeatable(bolola, 'o');
        array.middlePrint(bolola);
        array.endLy(bolola,'l','y');
        array.bob(bolola);
        array.space(text);
    }

}
