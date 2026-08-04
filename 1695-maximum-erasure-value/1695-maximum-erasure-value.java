class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sum  = 0, left = 0, right = 0, maxSum = 0;

        while(right < nums.length)
        {
            while(set.contains(nums[right]))
            {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }

            set.add(nums[right]);
            sum += nums[right];
            right++;

            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}