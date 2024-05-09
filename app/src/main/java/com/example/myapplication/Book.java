package com.example.myapplication;

public class Book {
    private String title;
    private String author;
    private int units;
    private String genre;

    public Book(String title, String author, String genre, int units) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.units = units;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public String getGenre() {
        return genre;
    }
}
