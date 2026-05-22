package nested.test;

public class Library {
    private Book[] books;
    private int count = 0;

    public Library(int size) {
        books = new Book[size];
    }

    public void addBook(String title, String author) {
        if (count < books.length) {
            books[count++] = new Book(title, author);
        } else {
            System.out.println("도서관이 가득 찼습니다. [" + title + "]를 추가할 수 없습니다.");
        }
    }

    public void showBooks() {
        for (int i = 0; i < count; i++) {
            books[i].print();
        }
    }

    static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public void print() {
            System.out.println("제목: " + title + ", 저자: " + author);
        }
    }
}