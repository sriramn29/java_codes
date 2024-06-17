
import java.util.Scanner;

public class InvertedRightTriangleStarPattern {
    public static void main(String[] args) {
        int i, j, n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number ");
        n = scanner.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = i; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}