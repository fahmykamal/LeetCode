class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through array
        for (int i = 0; i < nums.length; i++){
            // Calculate complement
            int complement = target - nums[i];

            // Check compliment
            if (map.containsKey(complement)){
                // If exists, return indices
                return new int[] {map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Output: [" + result1[0] + ", " + result1[1] + "]"); // Output: [0, 1]

        // Example 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("Output: [" + result2[0] + ", " + result2[1] + "]"); // Output: [1, 2]

        // Example 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        System.out.println("Output: [" + result3[0] + ", " + result3[1] + "]"); // Output: [0, 1]
    }
}