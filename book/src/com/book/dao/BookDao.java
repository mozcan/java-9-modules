package com.book.dao;

import com.book.model.Book;

public class BookDao {

    public void createBook(Book book) {
        System.out.println("""
                Book Name """ + book.name() + """
                Book Author """ + book.author() + """
                Book Publisher """ + book.publisher());
        System.out.println("New book has been created!");
    }

    public Book getBook() {
        var book = new Book("İnce Memed","Yaşar Kemal","YKY Yayınları");

        return book;
    }

}
