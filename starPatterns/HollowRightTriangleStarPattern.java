
import java.util.Scanner;

public class HollowRightTriangleStarPattern {
    public static void main(String[] args) {
        int i, j, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = scanner.nextInt();
        for (i = 1; i <= n; i++){
            for (j = 1; j <= i; j++){
                if (j == 1 || j == n || i == n || i == j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}