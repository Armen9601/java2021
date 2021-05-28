package blog;

import blog.enums.Category;
import blog.interfaces.Command;
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

            System.out.println("Please input " + Command.EXIT + " for EXIT");
            System.out.println("Please input " + Command.ADD_POST + " for ADD_POST");
            System.out.println("Please input " + Command.SEARCH_POST + " for SEARCH_POST");
            System.out.println("Please input " + Command.POSTS_BY_CATEGORY + " for print POSTS_BY_CATEGORY");
            System.out.println("Please input " + Command.ALL_POSTS + " for print ALL_POSTS");
            System.out.println("Please input " + Command.GET_BY_TITLE + " for GET_BY_TITLE");
            System.out.println("Please input " + Command.DELETE_POST + " for DELETE_POST");
            System.out.println("Please input " + Command.CHANGE_POST + " for CHANGE_POST");
            System.out.println("Please input " + Command.DELETE_BY_CATEGORY + " for DELETE_BY_CATEGORY");
            int coomand = Integer.parseInt(scanner.nextLine());
            switch (coomand) {
                case Command.EXIT:
                    run = false;
                    break;
                case Command.ADD_POST:
                    addPost();
                    break;
                case Command.SEARCH_POST:
                    searchPost();
                    break;
                case Command.POSTS_BY_CATEGORY:
                    postByCategory();
                    break;
                case Command.ALL_POSTS:
                    postStorageImpl.printAllPosts();
                    break;
                case Command.GET_BY_TITLE:
                    getByTitle();
                    break;
                case Command.DELETE_POST:
                    deletePost();
                    break;
                case Command.CHANGE_POST:
                    changePost();
                    break;
                case Command.DELETE_BY_CATEGORY:
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
        Post post =postStorageImpl.getPostByTitle(title);
        System.out.println("please input new text");
        String text = scanner.nextLine();
        post.setText(text);
        System.out.println("please input new category");
        Category category = Category.valueOf(scanner.nextLine());
        post.setCategory(category);

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
