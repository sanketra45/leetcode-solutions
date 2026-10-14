class Solution {
    public int totalFruit(int[] fruits) {

        // HAMARE PAAS 2 BASKETS HAI AND HAME MAXIMUM FRUITS STORE KRNE HAI
        // HAR BASKET ME UNIQUE TYPES KE HI FRUITS STORE HOTE HAI
        // TO HAM MAP BANAYENGE AND ELEMENTS KO STORE KRENGE

        int left = 0, right = 0, maxFruits = 0;
        Map<Integer, Integer> map = new HashMap<>();

        while(right < fruits.length)
        {
            // RIGHT SE HAR NAYE ELEMENT KO STORE KRENGE
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            // AGR MAP SIZE 2 SE JYADA HO GYI TO LEFT SE ELEMENTS REMOVE KRENGE
            if(map.size() > 2)
            {
                map.put(fruits[left], map.get(fruits[left]) - 1);

                // AGR KOI FRUIT KI FREQ 0 HO GYI TO USE REMOVE KR DENGE
                if(map.get(fruits[left]) == 0)
                {
                    map.remove(fruits[left]);
                }
                left++;
            }

            // HAR BAAR MAXFRUITS CALCULATE KRTE RHENGE
            if(map.size() <= 2)
            {
                maxFruits = Math.max(maxFruits, right - left + 1);
            }

            right++;
        }

        return maxFruits;
    }
}