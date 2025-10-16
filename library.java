import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public boolean checkoutBook(int bookId, int memberId) {
        Book book = findBookById(bookId);
        Member member = findMemberById(memberId);

        if (book == null) {
            System.out.println("Book not found.");
            return false;
        }
        if (member == null) {
            System.out.println("Member not found.");
            return false;
        }
        if (book.isCheckedOut()) {
            System.out.println("Book is already checked out.");
            return false;
        }
        if (!member.canCheckout()) {
            System.out.println("Member cannot check out more books.");
            return false;
        }

        book.checkOut();
        member.checkoutBook();
        System.out.println(member + " checked out " + book);
        return true;
    }

    public boolean returnBook(int bookId, int memberId) {
        Book book = f
