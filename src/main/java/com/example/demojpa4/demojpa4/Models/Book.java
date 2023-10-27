package com.example.demojpa4.demojpa4.Models;

import jakarta.persistence.*;
import org.hibernate.dialect.ColumnAliasExtractor;

// @Entity ---> Hibernate Pick it up because it is present in JPA Jar
// @Entity---> Spring Ioc Will not pick i up
@Entity
@Table(name = "my_book")
public class Book {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @Column(name = "book_name")
    private String name;
    private String authorName;

    @Column(name = "price")
    private int cost;


   // Default Constructor is needed for the Instantiation of the Object by Hibernate


    public Book() {
    }

    public Book(String name, String authorName, int cost) {
        this.name = name;
        this.authorName = authorName;
        this.cost = cost;
    }

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

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString(){
        return " { name "+this.getName()+", authorName "+this.getAuthorName()+"} ";
    }
}
