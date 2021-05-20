package blog;

import author.Author;

public class PostStorageImpl implements PostStorage {
    Post[] posts = new Post[10];
    int size = 0;

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
        for (int i = 0; i < size; i++) {
            System.out.println(posts[i]);
        }
    }

    @Override
    public void printPostsByCategory(String category) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getCategory().equalsIgnoreCase(category)) {
                System.out.println(posts[i]);
            }
        }
    }


}
