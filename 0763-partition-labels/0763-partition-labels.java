class Solution {
    public List<Integer> partitionLabels(String s) {

        // NOTE : DONT INCREAMENT THE LOOP VARIABLE IN THE FUNCTION DECLARATION
        List<Integer> result = new ArrayList<>();
        int startIdx = 0, endIdx = 0;

        for(int i = 0; i < s.length(); )
        {
            startIdx = i;
            endIdx = s.lastIndexOf(s.charAt(i));

            for(int j = startIdx; j < endIdx; j++)
            {
                int lastIdx = s.lastIndexOf(s.charAt(j));

                if(lastIdx > endIdx)
                {
                    endIdx = lastIdx;
                }
            }

            result.add(endIdx - startIdx + 1);
            i = endIdx + 1;
        }

        return result;
    }
}