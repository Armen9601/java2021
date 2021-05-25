package blog.model;

import blog.enums.Category;

import java.util.Date;

public class Post {
    private String title;
    private String text;
    private Category category;
    private Date createdData = new Date();

    public Post(String title, String text, Category category, Date createdData) {
        this.title = title;
        this.text = text;
        this.category = category;
        this.createdData = createdData;
    }

    public Post() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getCreatedData() {
        return createdData;
    }

    public void setCreatedData(Date createdData) {
        this.createdData = createdData;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", category='" + category + '\'' +
                ", createdData=" + createdData +
                '}';
    }
}
