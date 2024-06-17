
import java.util.Scanner;

public class HollowStarPattern {
    public static void main (String[] args) {
        int i, j, N;
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        for (i =1 ; i <= N; i++){
            for(j = 1; j <= N; j++){
                if(i == 1 || i == N || j == 1 || j == N){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        } 
    }
}