class Solution {
    public int subarraySum(int[] nums, int k) {

        // IS PROBLEM ME PAHLE HAM PRESUX SUM NIKALNGE AND HAR POINT PAR CHECK KRENGE KI KYA CURRENT ELEMENT OR PREVIOS KISI ELEMENT KA SUM K KE EQUALS AATA HAI YA NHI
        // ISKE LIYE HAM EK FORMULA KA USE KRENGE (PREFIXSUM - K) 
        // AGAR KISI PAHLE SE YE VALUE AGR MAP ME STORE HOGI TO HUM COUNT TO BADHA DENGE
        // AGR KISI DO ELEMENT TAK KA (PREFIXSUM - K) SAME HO TO UN DONO KA ADDTION EQUALS K HOGA
        // AGAR AISA SUM NHI MILA TO HUM US PREFIX SUM KO MAP ME PUT KR DENGE

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for(int num : nums)
        {
            prefixSum += num;
            if(map.containsKey(prefixSum - k))
            {
                count += map.get(prefixSum - k);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}