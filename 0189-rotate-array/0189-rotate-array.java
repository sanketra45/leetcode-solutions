class Solution {
    public void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];
        int n = nums.length;

        // HANDLE LARGE K
        k = k % n;

        // COPY THE LAST K ELEMENTS OF THE GIVEN ARRAY TO THE FRONT
        for(int i = 0; i < k; i++)
        {
            temp[i] = nums[n - k + i];
        }

        // COPY THE FIRST N - K ELEMENTS AFTER THE LAST K ELEMENTS
        for(int i = 0; i < (n - k); i++)
        {
            temp[k + i] = nums[i];
        }

        // COPY THE TEMP ARRAY INTO NUMS
        for(int i = 0; i < n; i++)
        {
            nums[i] = temp[i];
        }
    }
}