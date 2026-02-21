public class Student0 {
    String name;
    int rollnumber;

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Roll Number : " + rollnumber);
    }

    public static void main(String[] args) {

        Student0 student = new Student0();

        student.name = "John";
        student.rollnumber = 1;

        student.display();

    }
}
