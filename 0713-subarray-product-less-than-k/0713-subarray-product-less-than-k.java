class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int product = 1, right = 0, left = 0, count = 0;

        if(nums.length == 1) return 0;

        while(right < nums.length)
        {
            if(product == 0) product = 1;

            product = product * nums[right];

            while(product >= k)
            {
                product = product / nums[left];
                left++;
            }

            if(product < k) 
            {
                count += right - left + 1;
            }

            right++;
        }

        return count;
    }
}