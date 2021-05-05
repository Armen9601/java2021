package braceChecker;

public class BraceChecker {
    //սա հենց տեքստն է
    private String text;

    //կլասսի կոնստրուկտորն է, որը պետք է ընդունի String տիպի տեքստ, և վերագրի վերևի տեքստին
    //Որ չկարողանանք BraceChecker-ի օբյեկտը սարքենք առանց text-տալու կոնստրուկտորի միջոցով․
    public BraceChecker(String text) {
        this.text = text;
    }

    //սա հիմնական մեթոդն է, որի մեջ գրելու ենք ամբողջ լոգիկան․ աշխատելու ենք թե stack-ի հետ, թե վերևի text-ի
    public void check() {
        CharStack stack = new CharStack();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            char pop;
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')') {
                pop = stack.pop();
                if (pop != '(') {
                    System.out.println("Error: opened " + pop + " but closed " + c + " at " + i);
                }
            } else if (c == '}') {
                pop = stack.pop();

                if (pop != '{') {
                    System.out.println("Error: opened " + pop + " but closed " + c + " at " + i);
                }
            } else if (c == ']') {
                pop = stack.pop();
                if (pop != '[') {
                    System.out.println("Error: opened " + pop + " but closed " + c + " at " + i);
                }

            }

        }
    }
}
