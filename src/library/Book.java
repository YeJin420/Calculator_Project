package library;

public class Book {

    // 1. 속성
    private String title;
    private String author;
    private boolean isAvailable; // 대여 가능 여부(Y/N)
    private String category;

    // 2. 생성자
    Book(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    // 3. 기능
    public String getTitle() {
        return title;
    }

}
