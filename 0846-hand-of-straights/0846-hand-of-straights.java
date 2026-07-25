class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        // EK MAP BANAYENGE JISME HAR CARD KI FREQ STORE KRENGE
        // ARRAY KO SORT KRENGE JISSE SMALLEST ELEMENT KO PAHLE GROUP ME LE SAKE
        // ARRAY KO ITERATE KRENGE AND CHECK KRENGE KI US CARD KO GORUP ME LE SAKTE HAI YA NHI
        // AGR KISI CONSECUTIVE CARD KI FREQ 0 MILE TO GROUP NHI BAN SAKTA RETURN FALSE
        // AGR KISI CARD KO GROUP ME LE LIYA TO USKI FREQ DECREASE KR DENGE 1 SE
        
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : hand)
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Arrays.sort(hand);

        for(int num : hand)
        {
            if(map.get(num) > 0)
            {
                for(int i = 0; i < groupSize; i++)
                {
                    int curr = num + i;
                    if(map.getOrDefault(curr, 0) == 0)
                        return false;

                    map.put(curr, map.get(curr) - 1);
                }
            }
        }

        return true;
    }
}