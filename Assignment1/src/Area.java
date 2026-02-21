public class Area {
    void area(double radius) {
        double area = 3.14*radius * radius;
        System.out.println("Area of Circle " + area);
    }

    void area(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of Rectangle " + area);
    }

    void area(float base, float height) {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle " + area);
    }

    public static void main(String[] args) {
        Area area = new Area();

        area.area(10);
        area.area(12.3, 564);
        area.area(30, 40f);
    }
}