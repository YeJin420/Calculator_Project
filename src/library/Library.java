package library;

import java.util.ArrayList;
import java.util.List;

public class Library {

    // 1. 속성
    private String name;
    private String position;
    private List<Book> books; // [소년이온다] [bookB] [bookC]

    public Library() {
        this.name = "A";
        this.books = new ArrayList<>();
    }

    // 3.기능

    // 책 추갛하는 기능
    public void addBook(Book book) {
        books.add(book);
    }

    // 책을 조회하는 기능
    public Book findBook(String bookName) {
        for (Book book : books) {
            String foundBookTitle = book.getTitle();
            if(foundBookTitle.equals(bookName)) {
                return book;
            }
            System.out.println("F");
            book.getTitle();

        }

        return null;
    }



}
