package lecture08;

public class UpperBound {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,4,4};
        int num = 1;
        int index = UpperBound(arr, num);
        if (index != -1) {
            System.out.println("Number found at index " + index);
        } else {
            System.out.println("Number not found");
        }
    }

    static int UpperBound(int[] arr, int num) {
        int low = 0, high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (num == arr[mid]) {
                ans = mid + 1;
                low = mid + 1;
            } else if (num > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}

