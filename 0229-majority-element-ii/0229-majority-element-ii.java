class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums)
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num : nums)
        {
            if(map.get(num) > (nums.length / 3))
            {
                if(!list.contains(num))
                {
                    list.add(num);
                }
            }
        }

        return list;
    }
}