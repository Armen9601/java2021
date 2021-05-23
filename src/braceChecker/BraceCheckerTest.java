package braceChecker;



public class BraceCheckerTest {
    public static void main(String[] args) {
        String text = "Hello (fr[om) Java";
        BraceChecker braceChecker=new BraceChecker(text);
        braceChecker.check();


    }

}
