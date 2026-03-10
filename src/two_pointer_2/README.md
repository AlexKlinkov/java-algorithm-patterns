# Two Pointers Pattern

<img src="../../resources/two_pointer_2.jpg" width="320" height="192" alt="">

## 1. When you should use this pattern:
**Problems involving searching pairs in sorted arrays, palindrome validation, or 
trapping water/containers where you need to process elements from left and from 
right simultaneously, often with the goal of finding optimal combinations or 
satisfying specific conditions.**

## 2. The main gist of this approach:
1. Place two pointers at different positions of an array/list, at the start (left) and at the end (right)
2. Move pointers based on conditions, towards the center (leftPointer++, rightPointer--)
3. Process elements until pointers meet or cross

## 3. Examples of the **Real-World Business Cases**:

**Case 1: Address standardization**
* **Situation**: A delivery company processes addresses daily from various sources 
(web forms, phone calls, partner APIs). Addresses often contain inconsistencies like "123 Main St" vs
"St Main 123" or "Apt 4B" vs "B4 Apt". These variations cause delivery failures. The company needs to
validate address formats by checking if standardized address strings read the same forwards and backwards —
a strong indicator of correctly formatted addresses.
* **Solution**: [ValidPalindrome.java](ValidPalindrome.java)
* **Complexity**:
    - **Time O(n)**
    - **Space O(1)**

**Case 2: A route optimization for a delivery company**
* **Situation**: A delivery company uses 3 delivery vans that depart from the same hub each morning. 
Each delivery location has a "route efficiency score" (positive = ahead of schedule potential, 
negative = likely traffic delays). To maximize on-time delivery rates, dispatchers want to group
3 delivery stops whose efficiency scores sum to zero—creating perfectly balanced routes where 
delays in one area are offset by faster-than-expected deliveries elsewhere. They need to identify
all possible balanced triplets from their daily delivery manifest of stops.
* **Solution**: [ThreeSum.java](ThreeSum.java)
* **Complexity**:
    - **Time O(n²)**
    - **Space O(k)** - where **k** is the number of valid triplets found

**Case 3: Package stacking optimization**
* **Situation**: A delivery company has vans and packages are stacked in columns against the van walls.
During transit, packages shift and create gaps. The logistic team needs to calculate how many small packages
can be inserted into gaps between larger packages to maximize space utilization.
* **Solution**: [TrappingRainWater.java](TrappingRainWater.java)
* **Complexity**:
    - **Time O(n)**
    - **Space O(1)**

## 4. Practice Problems on LeetCode
🟢 **LeetCode #125 (Valid Palindrome)**\
🔵 **LeetCode #15 (3Sum)**\
🔴 **LeetCode #42 (Trapping Rain Water)**