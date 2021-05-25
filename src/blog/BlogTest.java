package blog;

import blog.enums.Category;
import blog.model.Post;
import blog.storage.PostStorage;
import blog.storage.PostStorageImpl;

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
            System.out.println("Please input " + PostStorage.GET_BY_TITLE + " for GET_BY_TITLE");
            System.out.println("Please input " + PostStorage.DELETE_POST + " for DELETE_POST");
            System.out.println("Please input " + PostStorage.CHANGE_POST + " for CHANGE_POST");
            System.out.println("Please input " + PostStorage.DELETE_BY_CATEGORY + " for DELETE_BY_CATEGORY");
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
                    break;
                case PostStorage.DELETE_POST:
                    deletePost();
                    break;
                case PostStorage.CHANGE_POST:
                    changePost();
                    break;
                case PostStorage.DELETE_BY_CATEGORY:
                    deleteByCategory();
                    break;
                default:
                    System.out.println("Wrong command");

            }
        }
    }

    private static void changePost() {
        System.out.println("please input title for change text and category ");
        String title = scanner.nextLine();
        postStorageImpl.changePost(title);
        System.out.println("please input new text");
        String text = scanner.nextLine();
        System.out.println("please input new category");
        Category category = Category.valueOf(scanner.nextLine());
        postStorageImpl.newChange(text, category);
    }

    private static void deleteByCategory() {
        System.out.println("Please input category for deleted all posts its category");
        String category =scanner.nextLine();
        postStorageImpl.delete(category);
    }

    private static void deletePost() {
        System.out.println("Plese input title for deleted post");
        String title = scanner.nextLine();
        postStorageImpl.deletePost(title);
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
        System.out.println("please input text");
        String text = scanner.nextLine();
        post.setText(text);
        try {
            System.out.println("please input category ");
            categoryPrint();
            Category category = Category.valueOf(scanner.nextLine());
            post.setCategory(category);
        } catch (IllegalArgumentException e) {
            System.out.println("please input valid category");
            addPost();

        }
        post.setCreatedData(date);
        postStorageImpl.add(post);
    }

    public static void categoryPrint() {
        Category[] values = Category.values();
        for (Category value : values) {
            System.out.println(value);
        }
    }
}
