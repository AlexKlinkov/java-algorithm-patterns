## Sliding Window Pattern
<img src="../../resources/sliding_window_1.jpg" width="320" height="192" alt="">

### 1. When you should use this pattern:
**Problems involving contiguous subarrays/substrings where 
you need to find optimal values (longest/shortest, max/min) or
satisfy specific conditions (like a target sum or unique characters).**

### 2. The main gist of this approach
1. Take a subarray of size k
2. Check conditions (sum, average, max, etc.)
3. Slide the window: remove left element, add right element

### 3. Examples of the **Real-World Business Cases**:

**Case 1: Optimizing warehouse inventory of a store (Max Average Demand Approach)**
*   **Situation**: A store has daily sales data for each month.
    For every month (4-weeks), it would like to find the 7-day period with
    the highest average sales across all data. This max weekly average is used 
    to set the minimum inventory level for the same month next year. A base level as if
    multiplied a given value at 4.
*   **Solution**: [MaximumAverageSubarray.java](MaximumAverageSubarray.java)
*   **Complexity**:
    - **Time O(n)**
    - **Space O(1)**

**Case 2: Optimizing loss branches of a store**
*   **Situation**: A chain calculated the median loss value for the entire network. 
    Now they want to find, for each branch, the **shortest time period** where the 
    **total loss** exceeds a certain threshold (e.g., 2x the median). This helps identify
    branches needing immediate optimization when losses spike.
*   **Solution**: [MinimumSizeSubarraySum.java](MinimumSizeSubarraySum.java)
*   **Complexity**:
    - **Time O(n)**
    - **Space O(1)**

**Case 3: Optimizing warehouse inventory of a store (Maximum Demand Approach)**
*   **Situation**: A store has weekly sales data for a product across multiple years.
    Instead of using average demand (Case 1), the store wants to prepare inventory based
    on peak weekly demand to prevent stockouts. The business logic: it's better to have
    surplus inventory than to lose sales from being understocked. For each month, it examines
    4-week historical periods and finds the maximum single-week (7-days) demand within that month.
    This peak value becomes the minimum inventory level for each week of that month next year.
*   **Solution**: [SlidingWindowMaximum.java](SlidingWindowMaximum.java)
*   **Complexity**:
    - **Time O(n)**
    - **Space O(k)**


### 3. Practice Problems on LeetCode
🟢 **LeetCode #643 (Maximum Average Subarray I)**\
🔵 **LeetCode #209 (Minimum Size Subarray Sum)**\
🔴 **LeetCode #239 (Sliding Window Maximum)**