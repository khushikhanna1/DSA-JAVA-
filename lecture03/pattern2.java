package lecture03;
import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {  
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after printing stars
        }
        
        scanner.close(); // Close the scanner to prevent resource leaks
    }
}

