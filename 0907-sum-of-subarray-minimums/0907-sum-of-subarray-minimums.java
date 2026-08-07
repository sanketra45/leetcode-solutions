class Solution {
    public int sumSubarrayMins(int[] arr) {
        long result = 0, n = arr.length;

        long MOD = 1000000007L;

        int[] pse = findPSE(arr);
        int[] nse = findNSE(arr);

        for(int i = 0; i < arr.length; i++)
        {
            int left = i - pse[i];
            int right = nse[i] - i;

            result = (result + (1L * left * right * arr[i]) % MOD) % MOD;
        }

        return (int)result;
    }

    private int[] findPSE(int[] arr)  
    {
        Stack<Integer> stack = new Stack();
        int[] pse = new int[arr.length];

        for(int i = 0; i < arr.length; i++)
        {
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i])
            {
                stack.pop();
            }

            if(stack.isEmpty())
            {
                pse[i] = -1;
            }
            else{
                pse[i] = stack.peek();
            }

            stack.push(i);

        }
        
        return pse;
    }

    private int[] findNSE(int[] arr)
    {
        Stack<Integer> stack = new Stack();
        int[] nse = new int[arr.length];

        for(int i = arr.length - 1; i >= 0; i--)
        {
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i])
            {
                stack.pop();
            }

            if(stack.isEmpty())
            {
                nse[i] = arr.length;
            }
            else{
                nse[i] = stack.peek();
            }

            stack.push(i);

        }
        
        return nse;
    }
}