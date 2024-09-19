public class KadaneAlgorithm {
    public static int maxSubArraySum(int[] nums) {
        // Initialize currentMax and globalMax to the first element
        int currentMax = nums[0];
        int globalMax = nums[0];

        // Start from the second element
        for (int i = 1; i < nums.length; i++) {
            // Update currentMax: decide whether to include current element in the subarray or start a new subarray
            currentMax = Math.max(nums[i], currentMax + nums[i]);

            // Update globalMax: keep track of the maximum sum encountered so far
            globalMax = Math.max(globalMax, currentMax);
        }

        return globalMax;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum is: " + maxSubArraySum(nums)); // Output: 6
    }
}
