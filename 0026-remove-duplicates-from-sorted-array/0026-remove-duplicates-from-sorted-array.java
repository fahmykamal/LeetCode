class Solution {
    public int removeDuplicates(int[] nums) {
        if ( nums.length == 0){
            return 0;
        }
        
        int uniqueIndex = 1;
        
        for ( int i = 1; i < nums.length ; i++ ){
            if ( nums[i] != nums[uniqueIndex - 1]){
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }
        
        return uniqueIndex;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1
        int[] nums1 = {1, 1, 2};
        int k1 = solution.removeDuplicates(nums1);
        System.out.println(k1); // Output: 2
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + " "); // Output: 1 2
        }
        
        // Test case 2
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = solution.removeDuplicates(nums2);
        System.out.println("\n" + k2); // Output: 5
        for (int i = 0; i < k2; i++) {
            System.out.print(nums2[i] + " "); // Output: 0 1 2 3 4
        }
    }
}