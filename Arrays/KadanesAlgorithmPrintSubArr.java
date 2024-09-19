public class KadaneAlgorithm {
    public static void maxSubArraySumAndPrint(int[] nums) {
        // Initialize variables
        int currentMax = nums[0];
        int globalMax = nums[0];
        
        // Initialize indices
        int start = 0;
        int end = 0;
        int tempStart = 0; // Temporary start index of potential new subarray

        // Iterate from the second element
        for (int i = 1; i < nums.length; i++) {
            // Decide whether to include nums[i] in the existing subarray or start a new one
            if (nums[i] > currentMax + nums[i]) {
                currentMax = nums[i];
                tempStart = i; // Start a new subarray at index i
            } else {
                currentMax += nums[i];
            }

            // Update globalMax and the start and end indices if a new maximum is found
            if (currentMax > globalMax) {
                globalMax = currentMax;
                start = tempStart;
                end = i;
            }
        }

        // Print the maximum subarray sum
        System.out.println("Maximum Subarray Sum is: " + globalMax);

        // Print the elements of the maximum subarray
        System.out.print("Maximum Subarray is: ");
        for (int i = start; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        maxSubArraySumAndPrint(nums); // Output: Maximum Subarray Sum is: 6, Maximum Subarray is: 4 -1 2 1
    }
}
