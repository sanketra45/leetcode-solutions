class Solution {
    public int longestOnes(int[] nums, int k) { 

        // HAME MAX ONES NIKALNE HAI JISME MAX K ZEROS AA SAKTE HAI
        // FIRST HAM RIGHT SE NAYA NUMBER ADD KRENGE 
        // AND CHECK KRENGE KI CURRENT BUNCH ME KITNE ZEROS HAI 
        // AGR K SE JYADA ZEROS HAI TO LEFT SE ZEROS REMOVE KRENGE
        // NHITO HAR BAAR MAXONES KI LENGTH CALCULATE KRENGE
        
        int left = 0, right = 0, maxOnes = 0, zeros = 0;

        while(right < nums.length)
        {
            if(nums[right] == 0) zeros++;

            while(zeros > k)
            {
                if(nums[left] == 0)
                {
                    zeros--;
                }
                left++;
            }

            if(zeros <= k)
            {
                maxOnes = Math.max(maxOnes, right - left + 1);
            }

            right++;
        }

        return maxOnes;
    }
}