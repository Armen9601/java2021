package author;
import java.util.Scanner;

public class AuthorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AuthorStorage authorStorage = new AuthorStorage();
        System.out.println("How many authors are you have???");
        int authorCount = scanner.nextInt();
        for (int i = 0; i < authorCount; i++) {
            Author newAuthor = authorStorage.createAuthor();
            authorStorage.add(newAuthor);
        }
        authorStorage.print();
        System.out.println("How many authors are you have???");
        int authorCount1 = scanner.nextInt();
        for (int i = 0; i < authorCount1; i++) {
            Author author = new Author("name" + i, "surname" + i, "email" + i, i, i % 2 != 0 ? "male" : "female");
            authorStorage.add(author);

        }
        authorStorage.print();

    }
}
