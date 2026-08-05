class Solution {
    public int missingNumber(int[] nums) {
        int actualSum = 0, expSum = 0;

        for(int num : nums)
        {
            actualSum += num;
        }

        for(int i = 1; i <= nums.length; i++)
        {
            expSum += i;
        }

        return expSum - actualSum;
    }
}