package com.example.demo.controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.entity.Book;
import com.example.demo.service.BookService;


@RestController
@RequestMapping("/library/book")
public class BookController {
	@Autowired
	private BookService bookService ;
	
	@GetMapping("/get-all-books")
	public List <Book> getAll() {
		return bookService.getAll();
	}
	@GetMapping("/get-book-by-id")
	public Book getBookById(@RequestParam int id) {
		return bookService.getBookById(id);
	}
	@PostMapping("/add-book")
	public Book addBook(@RequestBody Book book, @RequestParam int authorId,@RequestParam int catgId
			,@RequestParam int publisherId) {
		return bookService.addOrUpdateBook(book,authorId,catgId,publisherId);
		
	}
	@PostMapping("/update-book")
	public Book updateBook(@RequestBody Book book, @RequestParam int authorId,@RequestParam int catgId
			,@RequestParam int publisherId) {
		return bookService.addOrUpdateBook(book,authorId,catgId,publisherId);
	}
	@PostMapping("/delete-book-by-id")
		public void deleteById(@RequestParam int id) {
		bookService.deleteById(id);
	}
	@PostMapping("/delete-all-book")
	public void destroy() {
		bookService.destroy();
	}

}
