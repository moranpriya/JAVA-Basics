class Division {
    public static void main(String[] args) {
        int n = 10;
        int m = 0;

        try {
            int result = n/m;
            System.out.println("Result"+result);
        } catch(ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        }
    }
}
