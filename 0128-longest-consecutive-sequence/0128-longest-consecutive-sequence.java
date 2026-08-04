class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0) return 0;

        Set<Integer> set = new TreeSet<>();
        int count = 0, maxLength = 0;

        for(int num : nums)
        {
            set.add(num);
        }
        
        List<Integer> list = new ArrayList<>(set);
        for(int i = 0; i < list.size() - 1; i++)
        {
            if(list.get(i+1) == list.get(i) + 1)
            {
                count++;
                maxLength = Math.max(maxLength, count);
            }
            else{
                count = 0;
            }
        }

        return maxLength + 1;
    }
}