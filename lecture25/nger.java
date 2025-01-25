package lecture25;


import java.util.Stack;

public class nger {
    public static void main(String[] args) {
        NGE(new int[]{1, 3, 4, 2, 3, 3, 2});
    }

    public static void NGE(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!stk.isEmpty() && arr[stk.peek()] < arr[i]) {
                ans[stk.pop()] = arr[i];
            }
            stk.push(i);
        }

        while (!stk.isEmpty()) {
            ans[stk.pop()] = -1; // No greater element found
        }

        display(ans);
    }

    public static void display(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}