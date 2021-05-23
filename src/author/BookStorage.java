package author;

public class BookStorage {
    private int size = 0;
    Book[] books = new Book[10];

    public void add(Book book) {

        if (size > books.length - 1) {
            extend();
        }
        books[size] = book;
        size++;
    }


    //stexcel hin masivic  10 element aveli mec masiv
    //qcel hin masivi elementnery nwri mej
    //hin masivi hxumy kapel nori het
    private void extend() {
        Book[] arr = new Book[books.length + 10];
        for (int i = 0; i < books.length; i++) {
            arr[i] = books[i];
        }
        books = arr;

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println();
            System.out.print(books[i] + " ");
        }
        System.out.println();
    }


    public void searchByPrice(int price1, int price2) {
        for (int i = 0; i < size; i++) {
            if (books[i].getPrice() >= price1 && books[i].getPrice() <= price2){
                System.out.println(books[i]);

            }
        }

    }

    public void findbook(String title, String email) {

        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(title)&&
                    books[i].getAuthorEmail().contains(email))
                    System.out.println(books[i]);
        }
    }

    public void searchByPrice1(int price1) {
        for (int i = 0; i < size; i++) {
            if (books[i].getPrice()>=price1){
                System.out.println(books[i]);
            }

        }
    }
    public void maximum() {
        Book max;
        for (int j = 0; j < size; j++) {
            for (int k = 0; k < size - 1; k++) {
                if (books[k].getPrice() < books[k + 1].getPrice()) {
                    max = books[k + 1];
                    books[k + 1] = books[k];
                    books[k] = max;
                }

            }

        }
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);

        }

    }


    public void minimum() {
        Book min;
        for (int j = 0; j < size; j++) {
            for (int k = 0; k < size - 1; k++) {
                if (books[k].getPrice() > books[k + 1].getPrice()) {
                    min = books[k + 1];
                    books[k + 1] = books[k];
                    books[k] = min;
                }

            }

        }
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);

        }


    }




    public void add(){

    }
}
