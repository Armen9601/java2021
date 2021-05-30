package adportal.model;

import adportal.enums.Category;

import java.util.Date;
import java.util.Objects;

public class Advertisment {
    String title;
    String text;
    double price;
    Date date = new Date();
    Category category;
    User author;

    public Advertisment(String title, String text, double price, Date date, Category category, User author) {
        this.title = title;
        this.text = text;
        this.price = price;
        this.date = date;
        this.category = category;
        this.author = author;
    }

    public Advertisment() {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Advertisment{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", price=" + price +
                ", date=" + date +
                ", category=" + category +
                ", author=" + author +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Advertisment that = (Advertisment) o;
        return Double.compare(that.price, price) == 0 && Objects.equals(title, that.title) && Objects.equals(text, that.text) && Objects.equals(date, that.date) && category == that.category && Objects.equals(author, that.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, text, price, date, category, author);
    }
}
