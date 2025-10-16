public class Book {
    private int id;
    private String title;
    private String author;
    private boolean isCheckedOut;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isCheckedOut = false;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void checkOut() {
        isCheckedOut = true;
    }

    public void returnBook() {
        isCheckedOut = false;
    }

    public String toString() {
        return "Book: " + title + " by " + author + (isCheckedOut ? " (Checked Out)" : " (Available)");
    }
}
