public class libararyManagement {

    public static void main(String[] args) {

        System.out.println("Hello Rahul Saini, how's the day");

        Library library = new Library(
                "The Rahul",
                "Rahul Saini",
                "2004"
        );

        Library.addBooks(1);

        library.borrowBook();
        library.returnBook();
    }
}

class Library {

    static int totalBooks;

    String title;
    String author;
    String isbn;
    boolean isBookBorrowed;

    // static block (runs once)
    static {
        totalBooks = 0;
    }

    // constructor
    Library(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void addBooks(int count) {
        totalBooks += count;
    }

    void borrowBook() {
        if (!isBookBorrowed && totalBooks > 0) {
            totalBooks--;
            isBookBorrowed = true;
            System.out.println("Book borrowed: " + title);
        } else {
            System.out.println("Book not available");
        }
    }

    void returnBook() {
        if (isBookBorrowed) {
            totalBooks++;
            isBookBorrowed = false;
            System.out.println("Book returned: " + title);
        } else {
            System.out.println("This book was not borrowed");
        }
    }
}
