public class Library {

    private String bookname;
    private int bookno;
    private String bookauthor;
    private String bookpublication;

    // Constructor
    public Library(String bookname, int bookno, String bookauthor, String bookpublication) {
        this.bookname = bookname;
        this.bookno = bookno;
        this.bookauthor = bookauthor;
        this.bookpublication = bookpublication;
    }

    // Getters
    public String getBookname() {
        return bookname;
    }

    public int getBookno() {
        return bookno;
    }

    public String getBookauthor() {
        return bookauthor;
    }

    public String getBookpublication() {
        return bookpublication;
    }

    // Setters
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public void setBookno(int bookno) {
        this.bookno = bookno;
    }

    public void setBookauthor(String bookauthor) {
        this.bookauthor = bookauthor;
    }

    public void setBookpublication(String bookpublication) {
        this.bookpublication = bookpublication;
    }

    public static void main(String[] args) {

        Library lib = new Library("Java Programming", 101, "James Gosling", "Sun Publications");

        System.out.println("Book Name: " + lib.getBookname());
        System.out.println("Book No: " + lib.getBookno());
        System.out.println("Book Author: " + lib.getBookauthor());
        System.out.println("Book Publication: " + lib.getBookpublication());
    }
}
