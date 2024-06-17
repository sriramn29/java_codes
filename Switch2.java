
import java.util.Scanner;

public class Switch2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char Alpha;
        Alpha = scanner.next().charAt(0);
        switch(Alpha){
            case 'a' -> System.out.println("Vowel");
            case 'e' -> System.out.println("Vowel");
            case 'i' -> System.out.println("Vowel");
            case 'o' -> System.out.println("Vowel");
            case 'u' -> System.out.println("Vowel");
            default -> System.out.println("Consonent");
        }
    }
}