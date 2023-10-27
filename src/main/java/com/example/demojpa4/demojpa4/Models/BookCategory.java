package com.example.demojpa4.demojpa4.Models;

import jakarta.persistence.*;

import java.util.Iterator;
import java.util.Set;

@Entity
public class BookCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @OneToMany(mappedBy = "bookCategory",cascade = CascadeType.ALL)
    private Set<Book> books;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public BookCategory() {
    }

    public BookCategory(String name) {
        this.name = name;
    }

    public BookCategory(String name, Set<Book> books) {
        this.name = name;
        this.books = books;
        // se are fetching book and for every bookcategory we are setting this object as it id;
        this.books.forEach(x->x.setBookCategory(this));  // Ist way

        // 2nd Way
        Iterator it=books.iterator();
        while(it.hasNext()){
            Book book=(Book)it.next();
            book.setBookCategory(this);
        }

    }
}
