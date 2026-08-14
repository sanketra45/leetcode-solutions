class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(t.length() != s.length()) return false;

        // BHAI HAM HAR EK S KE CHARACTER KO CORRESPONDING EK T KE CHARACTER SE MAP KRENGE AND CHECK KRENGE KI KYA HAM SAB CHARACTER KO MATCH KR SAKTE HAI KI NHI

        Map<Character, Character> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++)
        {
            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if(!map.containsKey(original))
            {
                if(!map.containsValue(replacement))
                {
                    map.put(original, replacement);
                }
                else{
                    return false;
                }
            }

            else{
                char mappedVal = map.get(original);
                if(replacement != mappedVal) return false;
            }
        }
        
        return true;
    }
}