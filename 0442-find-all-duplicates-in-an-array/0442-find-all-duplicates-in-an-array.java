class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int num : nums)
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num : nums)
        {
            if(map.get(num) == 2) 
            {
                list.add(num);
                map.put(num, 0);
            }
        }

        return list;
    }
}