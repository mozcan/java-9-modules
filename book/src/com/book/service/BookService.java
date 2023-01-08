package com.book.service;

import com.book.dao.BookDao;
import com.book.model.Book;

public class BookService {

    private BookDao bookDao;

    public BookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void createBook(Book book) {
        this.bookDao.createBook(book);
    }

    public Book getBook() {
        return this.bookDao.getBook();
    }
}
