class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int right = 0, result = 0, count = 0;

        while (right < nums.length) {
            if (nums[right] == 1) {
                count++;
            }

            else if (nums[right] == 0) {
                result = Math.max(result, count);
                count = 0;
            }
            right++;
        }


        // for last ones 
        result = Math.max(result, count);

        return result;
    }
}