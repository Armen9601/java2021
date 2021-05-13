package author;


import java.util.Scanner;

class AuthorStorage {
    private int size = 0;
    Author[] array = new Author[10];

    public void add(Author author) {

        if (size > array.length - 1) {
            extend();
        }
        array[size] = author;
        size++;
    }


    //stexcel hin masivic  10 element aveli mec masiv
    //qcel hin masivi elementnery nwri mej
    //hin masivi hxumy kapel nori het
    private void extend() {
        Author[] arr = new Author[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }
        array = arr;

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println();
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    Author createAuthor() {
        Author author = new Author();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Author Name");
        String name = scanner.nextLine();
        System.out.println("Author SurnamE");
        String surname = scanner.nextLine();
        System.out.println("Email");
        String email = scanner.nextLine();
        System.out.println("Gender");
        String gender = scanner.nextLine();
        System.out.println("Age");
        int age = scanner.nextInt();
        author.setName(name);
        author.setSurname(surname);
        author.setEmail(email);
        author.setAge(age);
        author.setGender(gender);
        return author;
    }
}
