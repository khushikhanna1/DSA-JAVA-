package lecture10;

public class BSMagneticForce {
  
    
    
    static boolean check(int force, int[] basket, int num) {
        int count = 1; 
        int lastpos = basket[0]; 
        
        
        for (int i = 1; i < basket.length; i++) {
            if (basket[i] - lastpos >= force) { 
                lastpos = basket[i]; // Update the last position
                count++;
            }
        }
        
        return count >= num; // Return true if we can place at least 'num' balls
    }
    
    // Corrected method signature and parameters
    static int forceBetweenBalls(int[] basket, int num) {
        int low = 1; // Minimum force can't be less than 1
        int high = basket[basket.length - 1] - basket[0]; // Maximum possible force
        int ans = 0;
        
        while (low <= high) {
            int mid = (low + high) / 2; // Midpoint of the current range
            if (check(mid, basket, num)) { // Check if we can place 'num' balls with 'mid' force
                ans = mid; // Update answer
                low = mid + 1; // Try for a larger force
            } else {
                high = mid - 1; // Try for a smaller force
            }
        }
        
        return ans; // Return the maximum force found
    }
    
    public static void main(String[] args) {
        int[] basket = {1, 2, 4, 8, 9}; // Example basket positions
        int num = 3; // Number of balls to place
        System.out.println(forceBetweenBalls(basket, num)); // Call the method and print the result
    } 
}
    
