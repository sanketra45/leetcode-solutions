class Solution {
    public int maxAbsoluteSum(int[] nums) {
        
        int currMax = 0, currMin = 0;
        int maxSub = nums[0], minSub = nums[0];

        for(int num : nums)
        {
            currMax = Math.max(num, currMax + num);
            maxSub = Math.max(maxSub, currMax);

            currMin = Math.min(num, currMin + num);
            minSub = Math.min(minSub, currMin);
        }

        return Math.max(maxSub, Math.abs(minSub));
    }
        
}