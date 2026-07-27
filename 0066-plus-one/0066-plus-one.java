class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;    // WE START FROM LAST ELEMENT
        
        while(i >= 0){
            if(digits[i] < 9)   
            {
                digits[i] += 1;      // IF DIGIT IS SMALLER THAN 9 THEN WE JUST ADD 1 TO IT
                return digits;
            }

            else{
                digits[i] = 0;       // IF THE LAST DIGIT IS 9 THEN WE MAKE IT 0 AND CHECK THE PREVIOUS ONE
                i--;
            }
        }

        // IF ALL ELEMENTS ARE 9 THEN WE HAVE TO ADD A 1 AT THE START
        int[] ans = new int[digits.length + 1];       
        ans[0] = 1;

        return ans;
    }
}