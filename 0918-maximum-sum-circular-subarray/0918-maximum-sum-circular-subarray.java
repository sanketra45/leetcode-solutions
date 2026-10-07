class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currMax = 0, maxSub = nums[0];
        int currMin = 0, minSub = nums[0];

        int totalSum = 0;

        for(int num : nums)
        {
            // FINDING THE TOTAL SUM OF THE ARRAY
            totalSum = totalSum + num;

            // FINDING THE MAX SUB ARRAY
            currMax = Math.max(num, currMax + num);
            maxSub = Math.max(maxSub, currMax);

            // FINDING THE MIN SUBARRAY
            currMin = Math.min(num, currMin + num);
            minSub = Math.min(minSub, currMin);
        }

        // IF ALL NUMBERS ARE NEGATIVE
        if(maxSub < 0) return maxSub;

        return Math.max(maxSub, totalSum - minSub);
    }
}