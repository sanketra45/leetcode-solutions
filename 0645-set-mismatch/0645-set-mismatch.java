
// WELCOME TO MY PROFILE

class Solution {
    public int[] findErrorNums(int[] nums) {

        // initialize two variable which indicates duplicate value and missing value,
        // we initalize both with -1 because count of missing element be zero
        // and a count array which store freq of each num of array
        int duplicate = -1, missing = -1;
        int[] count  = new int[nums.length + 1];

        for(int num : nums)
        {
            count[num]++;
        }

        for(int i = 1; i <= nums.length; i++)
        {
            // if count of any number is 2 then it is the duplicate number
            // if the count of any number is 0 then it is the missing number
            if(count[i] == 2) duplicate = i;
            else if(count[i] == 0) missing = i;
        }

        // return the missing and duplicate number by using an array
        return new int[] {duplicate, missing};

    }
}