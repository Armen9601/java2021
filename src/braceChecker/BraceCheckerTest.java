package braceChecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        String text = "[(({[Hel[lo{] (from) [Java}}";
        BraceChecker braceChecker=new BraceChecker(text);
        braceChecker.check();
    }
}
