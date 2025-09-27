import java.util.Arrays;

public class target {
    public static void target(int arr[], int target) {
        Arrays.sort(arr);  // Sort the array first
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Elements at index " + left + " and " + right + " are the pair.");
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("No such pair found.");
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 1, 7, 4};
        target(arr, 12);
    }
}
