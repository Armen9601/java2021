package author;


import java.util.Scanner;

class AuthorStorage {
    private int size = 0;
    Author[] authors = new Author[10];

    public void add(Author author) {

        if (size >authors.length - 1) {
            extend();
        }
        authors[size] = author;
        size++;
    }


    //stexcel hin masivic  10 element aveli mec masiv
    //qcel hin masivi elementnery nwri mej
    //hin masivi hxumy kapel nori het
    private void extend() {
        Author[] arr = new Author[authors.length + 10];
        for (int i = 0; i < authors.length; i++) {
            arr[i] = authors[i];
        }
        authors = arr;

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println();
            System.out.print(authors[i] + " ");
        }
        System.out.println();
    }

    public void searchByName(String name) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getName().contains(name)){
                System.out.println(authors[i]);
            }

        }
    }
}
