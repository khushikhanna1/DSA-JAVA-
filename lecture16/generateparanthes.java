package lecture16;

public class generateparanthes {
    static void generateparanthesis(int n, int l, int r, String ans) {
        // Base case: when both left and right parentheses are used up
        if (n == l && l == r) {
            System.out.println(ans);
            return;
        }
        // If parentheses count exceeds the limit, return
        if (l > n || r > l) {
            return;
        }
        // Add a left parenthesis
        generateparanthesis(n, l + 1, r, ans + "{");
        // Add a right parenthesis
        generateparanthesis(n, l, r + 1, ans + "}");
    }

    public static void main(String[] args) {
        // Generate all valid combinations of parentheses for n=3
        generateparanthesis(3, 0, 0, "");
    }
}
