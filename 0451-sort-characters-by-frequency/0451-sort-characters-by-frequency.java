class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();

        char[] arr = s.toCharArray();

        for(char ch : arr)
        {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        List<Character> list = new ArrayList<>(map.keySet());

        list.sort((a, b) -> map.get(b) - map.get(a));

        for(char ch : list)
        {
            for(int i = 0; i < map.get(ch); i++)
            {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}