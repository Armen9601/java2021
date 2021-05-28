package blog.storage;


import blog.enums.Category;
import blog.model.Post;

public class PostStorageImpl implements PostStorage {
    Post[] posts = new Post[10];

    int size = 0;
    private int x;

    public PostStorageImpl() {


    }

    @Override
    public void add(Post post) {
        if (size > posts.length - 1) {
            extend();
        }
        posts[size] = post;
        size++;
    }

    private void extend() {
        Post[] posts1 = new Post[posts.length + 10];
        for (int i = 0; i < posts.length; i++) {
            posts1[i] = posts[i];
        }
        posts = posts1;

    }

    @Override
    public Post getPostByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getTitle().equalsIgnoreCase(title))
                return posts[i];
        }
        return null;
    }


    @Override
    public void searchPostsByKeyword(String keyword) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getTitle().contains(keyword) ||
                    posts[i].getText().contains(keyword)) {
                System.out.println(posts[i]);
            }
        }

    }

    @Override
    public void printAllPosts() {
        for (int i = 0; i < posts.length; i++) {
            if (posts[i] != null)
                System.out.println(posts[i]);
        }
    }


    @Override
    public void deletePost(String title) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getTitle().equalsIgnoreCase(title)&&posts[i+1]!=null) {
                Post del = posts[i + 1];
                posts[i + 1] = posts[i];
                posts[i] = del;

            }

        }
        posts[size - 1] = null;
        size--;


    }


    public void delete(String category) {
        Post[] newPosts = new Post[size];

        for (int i = 0; i < newPosts.length; i++) {
            if (posts[i] != null && posts[i].getCategory().name().equals(category)) {

                continue;
            }
            newPosts[i] = posts[i];
        }

        posts = newPosts;

    }

    @Override
    public void printPostsByCategory(String category) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getCategory().name().equalsIgnoreCase(category)) {
                System.out.println(posts[i]);
            }
        }
    }


}
