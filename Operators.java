public class Operators {
    public static void main(String[] args) {
        /*float a = 10, b = 2, c;
        c = a + b;
        System.out.println("Addition: " + c);
        c = a - b;
        System.out.println("Subtraction: " + c);
        c = a * b;
        System.out.println("Multiplication: " + c);
        c = a / b;
        System.out.println("Division: " + c);
        c = a % b;
        System.out.println("Remainder: " + c);*/
        int a = 3, b = 4, c;
        c = a + b + a++ + b++ + ++a + ++b;
        System.out.println(c);
    }
}