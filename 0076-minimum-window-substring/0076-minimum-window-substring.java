class Solution {
    public String minWindow(String s, String t) {
        int[] mapS = new int[256];
        int[] mapT = new int[256];

        int minLength = Integer.MAX_VALUE, left = 0, minStart = 0;

        // CHARACTER FREQ OF STRING T
        for(char ch : t.toCharArray())
        {
            mapT[ch]++;
        }


        // IN THIS LOOP WE STORE CHAR FREQ OF STRING S AND COMPUTE THE MINlENGTH BY CHECKING ALL THE CHAR OF T ARE EXIST IN S OR NOT
        for(int right = 0; right < s.length(); right++)
        {
            mapS[s.charAt(right)]++;

            while(contains(mapS, mapT))
            {
                if(minLength > right - left + 1)
                {
                    minLength = right - left + 1;
                    minStart = left;
                }

                mapS[s.charAt(left++)]--;
            }
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLength);
    }

    private boolean contains(int[] mapS, int[] mapT)
    {
        for(int i = 0; i < 256; i++)
        {
            if(mapT[i] > mapS[i])
            {
                return false;
            }
        }

        return true;
    }
}