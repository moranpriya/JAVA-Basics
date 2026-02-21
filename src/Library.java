class Student {
    private String name;
    private int rollNo;
    private String email;
    private String dept;
    private int semester;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getSemester() {
        return semester;
    }
}

class Teacher {
    private String name;
    private int empId;
    private String email;
    private String dept;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }
}

class Book {
    private String bookName;
    private int bookId;
    private String bookAuthor;
    private int bookCount;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }

    public int getBookCount() {
        return bookCount;
    }
}

public class Library {
    public static void main(String[] args) {

        // =========================
        // 1️⃣ STUDENT CLASS
        // =========================

        Student s = new Student();

        System.out.println("---- Student Initial Values ----");

        s.setName("A");
        s.setRollNo(101);
        s.setEmail("a@gmail.com");
        s.setDept("CSE");
        s.setSemester(5);

        System.out.println("Name: " + s.getName());
        System.out.println("Roll No: " + s.getRollNo());

        // Updating value
        s.setName("B");
        System.out.println("Updated Name: " + s.getName());


        // =========================
        // 2️⃣ TEACHER CLASS
        // =========================

        Teacher t = new Teacher();

        System.out.println("\n---- Teacher Initial Values ----");

        t.setName("Dr. Sharma");
        t.setEmpId(5001);
        t.setEmail("sharma@college.com");
        t.setDept("CSE");

        System.out.println("Name: " + t.getName());
        System.out.println("Employee ID: " + t.getEmpId());

        // Updating value
        t.setDept("ECE");
        System.out.println("Updated Department: " + t.getDept());


        // =========================
        // 3️⃣ BOOK CLASS
        // =========================

        Book b = new Book();

        System.out.println("\n---- Book Initial Values ----");

        b.setBookName("Java Programming");
        b.setBookId(9001);
        b.setBookAuthor("James Gosling");
        b.setBookCount(10);

        System.out.println("Book Name: " + b.getBookName());
        System.out.println("Book Count: " + b.getBookCount());

        // Updating value
        b.setBookCount(15);
        System.out.println("Updated Book Count: " + b.getBookCount());
    }
}

