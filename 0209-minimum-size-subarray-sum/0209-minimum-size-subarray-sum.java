class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minSize = Integer.MAX_VALUE, currentSum = 0;
        int low = 0, high = 0;

        while(high < nums.length)
        {
            currentSum += nums[high];

            while(currentSum >= target)
            {
                int currSize = high - low + 1;
                minSize = Math.min(minSize, currSize);

                currentSum -= nums[low];
                low++;
            }

            high++;
        }

        if(minSize < Integer.MAX_VALUE) return minSize;

        return 0;
    }
}