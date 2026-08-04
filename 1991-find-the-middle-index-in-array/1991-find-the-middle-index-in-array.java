class Solution {
    public int findMiddleIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0, rightSum = 0;

        for(int num : nums)
        {
            totalSum += num;
        }

        for(int i = 0; i < nums.length; i++)
        {
            rightSum = totalSum - leftSum - nums[i];

            if(rightSum == leftSum) return i;

            leftSum += nums[i];
        }

        return -1;
    }
}