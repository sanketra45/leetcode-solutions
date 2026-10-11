class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();

        //  FIRST WE SORT ALL THE ELEMENTS CHARACTER WISE AND THEN WE ONLY CHECK THE FIRST AND LAST ELEMENT AND COMPARE THE CHARACTER SO THAT WE CANNOT TRAVERSE THROUGH ALL THE ELEMENTS
        Arrays.sort(strs);

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();

        for(int i = 0; i < first.length; i++)
        {
            // JAHA ALAG CHARACTER DIKHA WAHA BREAK AUR UTNA PREFIX JO STRING ME STORE HUA HAI VO RETURN AGAR SAB WORD DIFF HAI TO "" RETURN HOGI
            if(first[i] != last[i]) break;
            result.append(first[i]);
        }

        return result.toString();
    }
}