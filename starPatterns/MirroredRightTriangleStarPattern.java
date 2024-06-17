
import java.util.Scanner;

public class MirroredRightTriangleStarPattern {
    public static void main(String[] args) {
        int i, j, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = scanner.nextInt();
        for (i = 1; i <= n; i++){
            for (j = i; j < n; j++){
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}