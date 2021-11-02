package com.galvanize.tmo.paspringstarter;


public class Book {
    private Integer id;

    private String author;
    private String title;
    private Integer yearPublished;




    public Book() {
    }

    public Book(Integer id, String author, String title, Integer publishedYear) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.yearPublished = publishedYear;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(Integer publishedYear) {
        this.yearPublished = publishedYear;
    }


}
