class Student2 {
    String name;

    void setName(String name) {
        this.name = name;
    }

    void displayStudent() {
        System.out.println("Student Name: " + name);
    }
}

class Boy extends Student2 {

    void displayBoy() {
        System.out.println("This is a Boy class inheriting Student.");
    }

    public static void main(String[] args) {
        Boy b = new Boy();

        b.setName("Rahul");
        b.displayStudent();
        b.displayBoy();
    }
}
