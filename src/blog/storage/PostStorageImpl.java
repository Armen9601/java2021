package blog.storage;


import blog.enums.Category;
import blog.model.Post;

public class PostStorageImpl implements PostStorage {
    Post[] posts = new Post[10];

    int size =0;
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
        Post post = new Post();
        for (int i = 0; i < size; i++) {
            if (posts[i].getTitle().equalsIgnoreCase(title))
                post = posts[i];
        }
        return post;
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
        Post[] posts1 = new Post[size - 1];
        for (int i = 0; i < posts1.length; i++) {
            posts1[i] = posts[i];
            if (posts1[i].getTitle().equalsIgnoreCase(title)) {
                for (int j = 0; j < posts1.length; j++) {
                    posts1[j] = posts[j + 1];

                }
                break;
            }

        }
        size--;
        posts = posts1;

    }




    @Override
    public void changePost(String title) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getTitle().equalsIgnoreCase(title)) {
                x = i;
            }

        }
    }

    @Override
    public void newChange(String text, Category category) {
        posts[x].setText(text);
        posts[x].setCategory(category);
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
