class Solution {
    public int maxProduct(int n) {

    // String str1 = String.valueOf(n);
    // int result = Integer.MIN_VALUE;
    
    // char[] chars = str1.toCharArray();
    // Arrays.sort(chars);
    // String str = new String(chars);

    // result = (str.charAt(str.length() - 1) - '0') * (str.charAt(str.length() - 2) - '0');

    // return result;


        int max1 = -1, max2 = -1;

        while(n != 0)
        {
            int digit = n % 10;
            if(digit > max1)
            {
                max2 = max1;
                max1 = digit;
            }

            else if(digit > max2)
            {
                max2 = digit;
            }

            n = n / 10;
        }

        return max1 * max2;
    }
}