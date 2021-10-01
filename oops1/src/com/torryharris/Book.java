package com.torryharris;

public class Book {
    int bookId;
    String bookName;
    int bookPrice;

    public Book(int bookId, String bookName, int bookPrice) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookPrice=" + bookPrice +
                '}';
    }
}
