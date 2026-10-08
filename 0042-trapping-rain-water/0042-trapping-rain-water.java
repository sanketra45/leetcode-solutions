class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while(left < right)
        {
            leftMax = Math.max(leftMax, height[left]);
            if(height[left] < height[right])
            {
                water += leftMax - height[left];
                left++;
            }

            else{
                rightMax = Math.max(rightMax, height[right]);
                water += rightMax - height[right];
                right--;
            }
        }
        return water;
    }
}