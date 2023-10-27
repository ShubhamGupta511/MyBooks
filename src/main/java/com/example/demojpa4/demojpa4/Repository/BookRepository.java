package com.example.demojpa4.demojpa4.Repository;

import com.example.demojpa4.demojpa4.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Integer>{

//    @Query(value = "select * from Book b where b.author_name=:my_name",nativeQuery = true)
//    public List<Book> findByAuthorName(String my_name);
//
//    @Query(value="select b from Book b where b.authorName=:authors_name")
//    public List<Book> findByAuthors(String authors_name);

//    public List<Book> findByCost(int cost);

//    public Book findById(int id);



}


// On Observation you can see that this BookTRepository not market as
// component Still it is Autowired in the Main Method

// Because whenever you inject any dependency you need to have it
// as bean as a Component type
