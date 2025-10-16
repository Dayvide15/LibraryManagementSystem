public class Member {
    private int id;
    private String name;
    private int maxBooks = 5;
    private int booksCheckedOut = 0;

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean canCheckout() {
        return booksCheckedOut < maxBooks;
    }

    public void checkoutBook() {
        if (canCheckout()) {
            booksCheckedOut++;
        }
    }

    public void returnBook() {
        if (booksCheckedOut > 0) {
            booksCheckedOut--;
        }
    }

    public String toString() {
        return "Member: " + name + " (Books checked out: " + booksCheckedOut + ")";
    }
}
