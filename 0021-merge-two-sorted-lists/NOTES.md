​# Explanation of Merge Two Sorted Lists

## Problem Overview
The task is to merge two sorted linked lists `list1` and `list2` into a single sorted linked list. The lists are sorted in non-decreasing order, and the merged list should maintain this order. The solution should be done by **splicing together** the nodes of the two lists.

### Example 1:
- **Input**: `list1 = [1, 2, 4]`, `list2 = [1, 3, 4]`
- **Output**: `[1, 1, 2, 3, 4, 4]`

### Example 2:
- **Input**: `list1 = []`, `list2 = []`
- **Output**: `[]`

### Example 3:
- **Input**: `list1 = []`, `list2 = [0]`
- **Output**: `[0]`

## Approach

We can solve this problem using **iteration**. The idea is to maintain pointers to the heads of both linked lists and compare their node values, appending the smaller value to the result list at each step. We will continue this until one of the lists becomes empty, then append the remaining part of the other list to the result.

### Detailed Explanation

1. **Initialization**:
   - Create a dummy node `dummy` with an arbitrary value `-1`. This dummy node will serve as the starting point of the merged list, and we will return `dummy.next` as the head of the merged list.
   - Set a pointer `current` to the dummy node. `current` will track the last node of the merged list as we build it.

2. **Iterate Through Both Lists**:
   - Use a `while` loop to iterate through both `list1` and `list2` as long as neither is empty.
   - At each step, compare the values of the current nodes of `list1` and `list2`.
     - If `list1.val` is smaller or equal to `list2.val`, append `list1`'s node to the merged list and move `list1` to its next node.
     - If `list2.val` is smaller, append `list2`'s node to the merged list and move `list2` to its next node.
   - Update `current` to point to the newly added node.

3. **Append Remaining Nodes**:
   - After the loop finishes, one of the lists might still have nodes left. Simply append the remaining nodes of that list to the end of the merged list.
   - This is done by checking if `list1` or `list2` is not `null`.

4. **Return the Result**:
   - Return `dummy.next` as the head of the merged list. The `dummy` node was used only to simplify the code, and the actual merged list starts from the node after `dummy`.

## Conclusion
This approach efficiently merges two sorted linked lists into a single sorted linked list while maintaining the order of elements. The use of a dummy node simplifies the process of appending nodes and returning the final merged list.
