class Grandfather {

    void showGrandfather() {
        System.out.println("This is Grandfather class.");
    }
}

class Father extends Grandfather {

    void showFather() {
        System.out.println("This is Father class.");
    }
}

class Son extends Father {

    void showSon() {
        System.out.println("This is Son class.");
    }

    public static void main(String[] args) {

        Son s = new Son();

        s.showGrandfather();
    }
}