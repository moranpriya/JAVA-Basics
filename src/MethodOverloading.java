import java.util.Scanner;

public class MethodOverloading {
    static void getArea(double r) {
        double a = 3.14*r*r;
        System.out.println("Area of Circle = " + a);
    }
    static void getArea(int s) {
        int a = s * s;
        System.out.println("Area of Square = " + a);
    }
    static void getArea(double l, double b) {
        double a = l * b;
        System.out.println("Area of Rectangle = " + a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to Area Calculator: ");
            System.out.println("Press 1 for circle");
            System.out.println("Press 2 for square");
            System.out.println("Press 3 for rectangle");
            System.out.println("Press 0 to exit");

            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Program exited");
                break;
            }
            switch (choice) {
                case 1:
                    System.out.println("Enter the radius of the circle: ");
                    double r = sc.nextDouble();
                    getArea(r);
                    break;

                    case 2:
                        System.out.println("Enter the side of the square: ");
                        int s = sc.nextInt();
                        getArea(s);
                        break;

                        case 3:
                            System.out.println("Enter the length of the rectangle: ");
                            double l = sc.nextDouble();
                            System.out.println("Enter the breadth of the rectangle: ");
                            double b = sc.nextDouble();
                            getArea(l,b);
                            break;

                            default:
                                System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}
