class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while(low <= high)
        {
            int mid = low + (high - low)/2;

            // IF WE GET THE ELEMENT AT THE MID WE RETURN IT
            if(nums[mid] == target) return mid;

            // WE CHECK THE LEFT PART IS SORTED OR NOT
            if(nums[low] <= nums[mid])
            {
                if(nums[low] <= target && target <= nums[mid])
                {
                    high = mid - 1;
                }

                else{
                    low = mid + 1;
                }
            }

            // CHECK THE RIGHT PART IS SORTED OR NOT
            else if(nums[high] >= nums[mid])
            {
                if(nums[high] >= target && target >= nums[mid])
                {
                    low = mid + 1;
                }

                else{
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}