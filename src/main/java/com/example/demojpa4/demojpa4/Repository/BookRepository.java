package com.example.demojpa4.demojpa4.Repository;

import com.example.demojpa4.demojpa4.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Integer>{

    public List<Book> findByAuthorName(String Name);

    public List<Book> findByCost(int cost);

    public Book findById(int id);



}


// On Observation you can see that this BookTRepository not market as
// component Still it is Autowired in the Main Method

// Because whenever you inject any dependency you need to have it
// as bean as a Component type
