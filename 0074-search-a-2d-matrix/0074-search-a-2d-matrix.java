class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int low = 0, high = m * n - 1;

        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            int row = mid / n;
            int cols = mid % n;

            int val = matrix[row][cols];

            if(val == target) return true;
            else if(target < val) high = mid - 1;
            else low = mid + 1;
        }

        return false;
    }
}