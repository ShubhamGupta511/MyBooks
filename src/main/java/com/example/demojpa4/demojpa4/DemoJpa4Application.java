package com.example.demojpa4.demojpa4;

import com.example.demojpa4.demojpa4.Models.Book;
import com.example.demojpa4.demojpa4.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class DemoJpa4Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoJpa4Application.class, args);
	}

	@Autowired
	BookRepository bookRepository;

	//Whenever you launch your app this code will exceute automatically so
	// To test your function dont have call API again and again
	@Override
	public void run(String... args) throws Exception {

		ArrayList<Book> book= new ArrayList<Book>();

       Book b1=new Book(3,"XYZ","DGHJ",100);
       Book b2=new Book(4,"The Startup","BJD",1000);
	   Book b3=new Book(2,"The Investing","The Benjamin Gramham",10);
	   book.add(b1);
	   book.add(b2);
	   book.add(b3);

	   bookRepository.saveAll(book);
//	   bookRepository.save(b1);

		System.out.println(bookRepository.findAll());
		System.out.println(bookRepository.findByAuthorName("DGHJ"));
		System.out.println(bookRepository.findByCost(100));
		System.out.println(bookRepository.findById(4));

	}
}
