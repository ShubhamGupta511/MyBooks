package com.example.demojpa4.demojpa4.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

// @Entity ---> Hibernate Pick it up because it is present in JPA Jar
// @Entity---> Spring Ioc Will not pick i up
@Entity
public class Book {

    @Id
    private int id;
    private String name;
    private String authorName;
    private int cost;


    // Default Constructor is needed for the Instantiation of the Object by Hibernate


    public Book() {
    }

    public Book(int id, String name, String authorName, int cost) {
        this.id = id;
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
