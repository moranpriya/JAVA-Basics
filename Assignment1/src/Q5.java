class Student {

    void display() {
        System.out.println("This is Student class method.");
    }
}

class Girl extends Student {

    @Override
    void display() {
        System.out.println("This is Girl class overriding Student method.");
    }

    public static void main(String[] args) {
        Girl g = new Girl();
        g.display();
    }
}