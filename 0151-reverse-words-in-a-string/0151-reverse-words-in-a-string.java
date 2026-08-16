class Solution {
    public String reverseWords(String s) {
        List<String> list = new ArrayList<>();
        int left = 0, right = 0;

        while(left < s.length())
        {
            while(left < s.length() && s.charAt(left) == ' ') left++;

            if(left == s.length()) break;

            right = left;
            while(right < s.length() && s.charAt(right) != ' ')
            {
                right++;
            }

            list.add(s.substring(left, right));
            left = right + 1;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = list.size() - 1; i >= 0; i--)
        {
            sb.append(list.get(i));

            if(i != 0) sb.append(" ");
        }

        return sb.toString();
    }
}