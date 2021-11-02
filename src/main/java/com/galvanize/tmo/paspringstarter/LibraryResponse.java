package com.galvanize.tmo.paspringstarter;


import java.util.List;

public class LibraryResponse {

    private List<Book> books;

    public LibraryResponse(List<Book> books) {
        this.books = books;
    }

    public LibraryResponse() {
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
