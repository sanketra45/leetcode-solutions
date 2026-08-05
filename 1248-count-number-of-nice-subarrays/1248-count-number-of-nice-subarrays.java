class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0, count = 0, odd = 0;

        map.put(0, 1);

        for(int num : nums)
        {
            if(num % 2 != 0) odd++;

            if(map.containsKey(odd - k))
            {
                count += map.get(odd - k);
            }

            map.put(odd, map.getOrDefault(odd, 0) + 1);
        }

        return count;
    }
}