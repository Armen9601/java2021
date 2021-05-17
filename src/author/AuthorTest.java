package author;

import java.util.Scanner;

public class AuthorTest {
    static Scanner scanner = new Scanner(System.in);
    static AuthorStorage authorStorage = new AuthorStorage();
    static BookStorage bookStorage = new BookStorage();

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add Author");
            System.out.println("Please input 2 for search Author by name");
            System.out.println("Please input 3 for print all Authors ");
            System.out.println("Please input 4 for add book ");
            System.out.println("Please input 5 for print all books ");
            System.out.println("Please input 6 for Print Books by price range ");
            System.out.println("Please input 7 for Print Books is book Exists ");

            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    run = false;
                    break;
                case "1":
                    addAuthor();
                    break;
                case "2":
                    searchAuthor();
                    break;
                case "3":
                    authorStorage.print();
                    break;
                case "4":
                    addBook();
                    break;
                case "5":
                    bookStorage.print();
                    break;
                case "6":
                    searchPrice();
                    break;
                case"7":
                    bookExist();
                    break;
                default:
                    System.out.println("wrong command");

            }
        }

    }

    private static void bookExist() {
        System.out.println("please input book title");
        String title=scanner.nextLine();
        System.out.println("please input Author email");
        String email=scanner.nextLine();
        bookStorage.findbook(title,email);
    }

    private static void searchPrice() {
        System.out.println("please input price");
        int price1=Integer.parseInt(scanner.nextLine());
        int price2=Integer.parseInt(scanner.nextLine());
        bookStorage.searchByPrice(price1,price2);

    }

    private static void searchAuthor() {
        System.out.println("please input name");
        String name = scanner.nextLine();
        authorStorage.searchByName(name);
    }

    public static void addAuthor() {
        System.out.println("please input Authors data");
        Author author = new Author();

        System.out.println("Author Name");
        author.setName(scanner.nextLine());
        System.out.println("Author SurnamE");
        author.setSurname(scanner.nextLine());
        System.out.println("Email");
        author.setEmail(scanner.nextLine());
        System.out.println("Age");
        author.setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println("Gender");
        String gender = scanner.nextLine();
        if (!"MALE".equalsIgnoreCase(gender) &&
                !"FEMALE".equalsIgnoreCase(gender)) {
            System.err.println("Wrong gender");
            return;
        }

        author.setGender(gender);
        authorStorage.add(author);


    }

    public static void addBook() {
        System.out.println("Please input book");
        Book book = new Book();
        System.out.println("Book title");
        book.setTitle(scanner.nextLine());
        System.out.println("Book description");
        book.setDescription(scanner.nextLine());
        System.out.println("Book price");
        book.setPrice(Integer.parseInt(scanner.nextLine()));
        System.out.println("Book count");
        book.setCount(scanner.nextLine());
        System.out.println("Book authorEmail");
        book.setAuthorEmail(scanner.nextLine());
        bookStorage.add(book);
    }
}
