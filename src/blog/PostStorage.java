package blog;

public interface PostStorage {
    int EXIT = 0;
    int ADD_POST = 1;
    int SEARCH_POST = 2;
    int POSTS_BY_CATEGORY = 3;
    int ALL_POSTS = 4;
    int GET_BY_TITLE = 5;
    int DELETE_POST = 6;
    int CHANGE_POST = 7;
    int DELETE_BY_CATEGORY = 8;

    void add(Post post);

    Post getPostByTitle(String title);

    void searchPostsByKeyword(String keyword);

    void printAllPosts();

    void printPostsByCategory(String category);

    void deletePost(String title);

    void deleteByCategory(Category category);

    void changePost(String title);

    void newChange(String text, Category category);
}

