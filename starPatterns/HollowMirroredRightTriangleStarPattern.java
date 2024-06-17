
import java.util.Scanner;

public class HollowMirroredRightTriangleStarPattern {
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
                if(i == n || j == 1 || j == i){
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