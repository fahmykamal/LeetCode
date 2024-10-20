class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i=0; i<nums.length; i++){
            if ( nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        int nums1[] = {3,2,2,3};
        int val1 = 3;
        int k1 = solution.removeElement(nums1, val1);
        System.out.println("Output: " + k1 + ", nums = " + java.util.Arrays.toString(nums1));
    }
}