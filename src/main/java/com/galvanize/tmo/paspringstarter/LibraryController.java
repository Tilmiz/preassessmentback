package com.galvanize.tmo.paspringstarter;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class LibraryController {

    @GetMapping("/health")
    public void health() {

    }

    private List<Book> bookList;

    public LibraryController(List<Book> bookList) {
        this.bookList = new ArrayList<>();
    }

    @PostMapping("/api/books")
    public ResponseEntity<Book> addBook(@RequestBody LibraryRequest libraryRequest) {

        Book book = new Book();

        book.setAuthor(libraryRequest.getAuthor());
        book.setTitle(libraryRequest.getTitle());
        book.setPublishedYear(libraryRequest.getPublishedYear());
        book.setId(bookList.size() + 1);

        bookList.add(book);

        return new ResponseEntity<>(book, HttpStatus.OK);
    }

    @GetMapping("/api/books")
    public ResponseEntity<List<Book>> getAllBooks() {

        Collections.sort(bookList, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                try {
                    char [] chars1 = o1.getTitle().toCharArray();
                    char [] chars2 = o2.getTitle().toCharArray();

                    int count = 0;

                    while (count < chars1.length || count< chars2.length){

                        if(chars1[count] > chars2[count]){
                            return 1;
                        }else if (chars1[count] < chars2[count]){
                            return -1;
                        } else {
                            count++;
                        }
                    }

                    return 0;
                }catch (Exception e){
                    return 0;
                }
            }
        });
        return new ResponseEntity<List<Book>>(bookList, HttpStatus.OK);
    }
}
