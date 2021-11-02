package com.galvanize.tmo.paspringstarter;


public class LibraryResponse {

    private Integer id;

    private String author;
    private String title;
    private Integer publishedYear;


    public LibraryResponse() {
    }

    public LibraryResponse(Integer id, String author, String title, Integer publishedYear) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.publishedYear = publishedYear;
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

    public Integer getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(Integer publishedYear) {
        this.publishedYear = publishedYear;
    }
}
