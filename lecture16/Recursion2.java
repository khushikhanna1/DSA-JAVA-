package lecture16;

public class Recursion2 {
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

    public static void main(String[] args) {
        String s = "car"; // Input string
        printsubseq(s, ""); // Correctly invoke the method without assigning it to a variable
    }
}