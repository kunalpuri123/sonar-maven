package com.example.library;

import java.util.Objects;

/**
 * Represents a Book entity in the library system.
 */
public class Books {

    private int id;
    private String title;
    private String author;
    private int yearPublished;
    private String genre;

    // Default constructor
    public Books() {
    }

    // Parameterized constructor
    public Books(int id, String title, String author, int yearPublished, String genre) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.genre = genre;
    }

    // Getter and setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearPublished=" + yearPublished +
                ", genre='" + genre + '\'' +
                '}';
    }

    // Override equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return id == books.id &&
                yearPublished == books.yearPublished &&
                Objects.equals(title, books.title) &&
                Objects.equals(author, books.author) &&
                Objects.equals(genre, books.genre);
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, yearPublished, genre);
    }
}
