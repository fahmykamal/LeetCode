# Explanation of Remove Duplicates from Sorted Array

## Problem Overview
The task is to remove duplicates from a given integer array `nums` that is sorted in non-decreasing order. The goal is to ensure that each unique element appears only once while maintaining the original order of the elements. The function should return the number of unique elements, `k`, and modify the input array `nums` such that the first `k` elements contain these unique values.

## Approach
To solve this problem, we can use a two-pointer technique to iterate through the array while keeping track of the unique elements. This approach modifies the array in-place, ensuring that we only need to use constant extra space.

### Detailed Explanation

1. **Edge Case**:
   - First, we check if the input array is empty. If it is, we return `0` since there are no elements to process.

2. **Initialization**:
   - We set a pointer `uniqueIndex` to `1`. This pointer will track the position where the next unique element should be placed in the array. The first element is always considered unique.

3. **Iterating Through the Array**:
   - We start a loop from the second element of the array (index `1`).
   - For each element, we check if it is different from the last unique element (which is located at `nums[uniqueIndex - 1]`):
     - If it is different, we assign the current element to `nums[uniqueIndex]`.
     - Then, we increment the `uniqueIndex` to point to the next position for potential unique elements.

4. **Return the Result**:
   - After the loop, we return `uniqueIndex`, which represents the number of unique elements found in the array.

## Conclusion
This solution efficiently removes duplicates from a sorted array in-place and returns the count of unique elements. The two-pointer technique minimizes space usage while preserving the relative order of unique elements, fulfilling the problem requirements.
​
