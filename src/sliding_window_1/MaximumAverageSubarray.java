package sliding_window_1;

/**
 * One way of solution 🟢 **LeetCode #643 (Maximum Average Subarray I)**
 *
 * @see <a href="https://leetcode.com/problems/maximum-average-subarray-i/">
 */
public class MaximumAverageSubarray {

    /**
     * Finds the max average value in a subarray of defined length.
     *
     * @param k    - the defined length of a subarray
     * @param nums - initial array of integers
     * @return the max average value of the subarray with defined its length
     */
    public double findMaxAverage(int[] nums, int k) {
        // 1. set a current sum as the first k-elements from initial array
        double currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        // 2. set a sliding window, we add right element from an initial array and remove the left one
        double currentMaxSum = currentSum;
        for (int i = k; i < nums.length; i++) { //
            currentSum += nums[i] - nums[i - k];
            currentMaxSum = Math.max(currentMaxSum, currentSum); // 3. define the max sum
        }

        // 4. calculate average value
        return currentMaxSum / k;
    }
}
