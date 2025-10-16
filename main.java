public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add some books
        library.addBook(new Book(1, "The Hobbit", "J.R.R. Tolkien"));
        library.addBook(new Book(2, "1984", "George Orwell"));
        library.addBook(new Book(3, "To Kill a Mockingbird", "Harper Lee"));

        // Add some members
        library.addMember(new Member(1, "Alice"));
        library.addMember(new Member(2, "Bob"));

        // Test checkout and return
        library.checkoutBook(1, 1); // Alice checks out The Hobbit
        library.checkoutBook(2, 1); // Alice checks out 1984
        library.returnBook(1, 1);   // Alice returns The Hobbit
        library.checkoutBook(3, 2); // Bob checks out To Kill a Mockingbird
    }
}
