package bookop;

import model.Book;

import java.util.ArrayList;

public class BookOperationImpl implements BookOperations{
    private ArrayList<Book>  blist = new ArrayList<Book>();
    @Override
    public String addABook(Book book) {
        blist.add(book);
        return "Book added successfully!!";
    }

    @Override
    public ArrayList<Book> getAllBooks() {
        return blist;
    }

    @Override
    public Book getABook(int bookId) {
        for (Book book:blist)
        {
            if (book.getBookId()==bookId)
                return book;
        }
        return null;
    }

    @Override
    public String setBookPrice(int bookId, int upPrice) {
        Book book = getABook(bookId);
        book.setBookPrice(upPrice);
        return "Book price updated sucessfully!!";
    }
}
