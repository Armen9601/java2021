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
            System.out.println("Please input 6 for Print Books by price range");
            System.out.println("Please input 7 for Print Books is book Exists");
            System.out.println("Please input 8 for sorting prices by maximum");
            System.out.println("Please input 9 for sorting prices by minimum");

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
                    System.out.println("please input 1 for only started price");
                    System.out.println("please input 2 for started and ended prices");
                    String com1=scanner.nextLine();
                    switch (com1){
                        case"1":
                            searchPrice1();
                            break;
                        case"2":
                            searchPrice();
                            break;
                        default:
                            System.out.println("wrong command");
                    }
                    break;
                case"7":
                    bookExist();
                    break;
                case"8":
                    bookStorage.maximum();
                    break;
                case"9":
                    bookStorage.minimum();
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
        System.out.println("please input started and ended prices");
        System.out.println("start price");
        int price1=Integer.parseInt(scanner.nextLine());
        System.out.println("end price");
        int price2=Integer.parseInt(scanner.nextLine());
        bookStorage.searchByPrice(price1,price2);

    }
    private static void searchPrice1() {
        System.out.println("please input started price");
        int price1=Integer.parseInt(scanner.nextLine());
        bookStorage.searchByPrice1(price1);

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
        book.setCount(Integer.parseInt(scanner.nextLine()));
        System.out.println("Book authorEmail");
        book.setAuthorEmail(scanner.nextLine());
        bookStorage.add(book);
    }
}
