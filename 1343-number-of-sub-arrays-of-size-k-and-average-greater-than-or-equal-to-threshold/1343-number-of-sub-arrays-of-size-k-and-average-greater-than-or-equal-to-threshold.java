class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0, count = 0;

        for(int i = 0; i < k; i++)
        {
            sum += arr[i];
        }

        if(sum / k >= threshold) count++;

        int current = sum;
        for(int i = 1; i <= arr.length - k; i++)
        {
            current = current - arr[i - 1] + arr[k + i - 1];
            
            if(current / k >= threshold) count++;
        }

        return count;
    }
}