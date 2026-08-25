class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];

        result[0] = findFirstOccur(nums, target);
        result[1] = findLastOccur(nums, target);

        return result;
    }

    private int findFirstOccur(int[] nums, int target)
    {
        int low = 0, high = nums.length - 1, first = -1;

        while(low <= high)
        {
            int mid = low + (high - low) / 2;

            // WE WILL CONTINUE SEARCHING TOWARDS LEFT EVEN AFTER GETTING THE TARGET TO GET FIRST OCCURENCE
            if(nums[mid] == target)
            {
                first = mid;
                high = mid - 1;
            }

            else if(target < nums[mid]) high = mid - 1;

            else low = mid + 1;
        }

        return first;
    }

    private int findLastOccur(int[] nums, int target)
    {
        int low = 0, high = nums.length - 1, last = -1;

        while(low <= high)
        {
            int mid = low + (high - low) / 2;

            // WE WILL CONTINUE SEARCHING TOWARDS RIGHT EVEN AFTER GETTING THE TARGET TO GET LAST OCCURENCE
            if(nums[mid] == target)
            {
                last = mid;
                low = mid + 1;
            }

            else if(target < nums[mid]) high = mid - 1;

            else low = mid + 1;
        }

        return last;
    }
}