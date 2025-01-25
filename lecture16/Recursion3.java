package lecture16;

public class Recursion3 {

    // Recursive function to print all subsequences
    static void printsubseq(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans); // Print the current subsequence
            return;
        }
        char a = ques.charAt(0);
        // Include the current character
        printsubseq(ques.substring(1), ans + a);
        // Exclude the current character
        printsubseq(ques.substring(1), ans);
    }

    // Recursive function to generate coin toss sequences
    static void cointoss(int n, String ans) {
        if (n == 0) {
            System.out.println(ans); // Print the generated sequence
            return;
        }
        cointoss(n - 1, ans + "H"); // Add "H" (heads)
        cointoss(n - 1, ans + "T"); // Add "T" (tails)
    }

    public static void main(String[] args) {
        String s = "car";

        // Call the printsubseq function
        System.out.println("Subsequences of " + s + ":");
        printsubseq(s, "");

        // Call the cointoss function
        System.out.println("\nCoin toss sequences of 3 tosses:");
        cointoss(3, "");
    }
}

    