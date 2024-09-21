package lecture03;

public class pattern3 {
    static void printLFT(int n) {
        for (int i = 1; i <= n; i++) { // Loop to control the number of lines
            for (int k = 1; k <= (n - i); k++) {
                System.out.print("  "); // Print spaces
            }
            for (int j = 1; j <= i; j++) { // Loop to print stars
                System.out.print("* "); // Corrected to print stars
            }
            System.out.println(); // Move to the next line after printing stars
        }
    }

    public static void main(String[] args) {
        int n = 4; // Change this number to adjust the height of the triangle
        printLFT(n);
    }
}
