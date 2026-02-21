public class Student1 {
    String name;
    int rollnumber;

    Student1(String name, int rollnumber) {
        this.name = name;
        this.rollnumber = rollnumber;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollnumber);
    }

    public static void main(String[] args) {
        Student1 student1 = new Student1("Bob", 5);
        student1.display();
    }
}
