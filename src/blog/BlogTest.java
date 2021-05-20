package blog;

import java.util.Date;
import java.util.Scanner;

public class BlogTest {
    static Scanner scanner = new Scanner(System.in);
    static PostStorage postStorageImpl = new PostStorageImpl();

    public static void main(String[] args) {


        boolean run = true;
        while (run) {
            System.out.println("Please input " + PostStorage.EXIT + " for EXIT");
            System.out.println("Please input " + PostStorage.ADD_POST + " for ADD_POST");
            System.out.println("Please input " + PostStorage.SEARCH_POST + " for SEARCH_POST");
            System.out.println("Please input " + PostStorage.POSTS_BY_CATEGORY + " for print POSTS_BY_CATEGORY");
            System.out.println("Please input " + PostStorage.ALL_POSTS + " for print ALL_POSTS");
            System.out.println("Please input " + PostStorage.GET_BY_TITLE + " for print ALL_POSTS");
            int coomand = Integer.parseInt(scanner.nextLine());
            switch (coomand) {
                case PostStorage.EXIT:
                    run = false;
                    break;
                case PostStorage.ADD_POST:
                    addPost();
                    break;
                case PostStorage.SEARCH_POST:
                    searchPost();
                    break;
                case PostStorage.POSTS_BY_CATEGORY:
                    postByCategory();
                    break;
                case PostStorage.ALL_POSTS:
                    postStorageImpl.printAllPosts();
                    break;
                case PostStorage.GET_BY_TITLE:
                    getByTitle();
                default:
                    System.out.println("Wrong command");

            }
        }
    }

    private static void getByTitle() {
        System.out.println("plese input title");
        String title = scanner.nextLine();
        Post post = postStorageImpl.getPostByTitle(title);
        System.out.println(post);
    }

    private static void postByCategory() {
        System.out.println("plese input category");
        String category = scanner.nextLine();
        postStorageImpl.printPostsByCategory(category);

    }

    private static void searchPost() {
        System.out.println("Please input title or text");
        postStorageImpl.searchPostsByKeyword(scanner.nextLine());
    }

    private static void addPost() {
        Date date = new Date();
        Post post = new Post();
        System.out.println("Please input title");
        String title = scanner.nextLine();
        post.setTitle(title);
        System.out.println("plese input text");
        String text = scanner.nextLine();
        post.setText(text);
        System.out.println("please input category");
        String category = scanner.nextLine();
        post.setCategory(category);
        post.setCreatedData(date);
        postStorageImpl.add(post);
    }
}
