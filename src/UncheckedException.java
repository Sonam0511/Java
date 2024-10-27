public class UncheckedException {
    public static void main(String[] args) {
        try {

            int result = divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}

