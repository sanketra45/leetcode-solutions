class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int count = 0, mxCount = 0, row = 0;

        for(int i = 0; i < mat.length; i++)
        {
            for(int j = 0; j < mat[0].length; j++)
            {
                if(mat[i][j] == 1) count++;
            }
            
            if(count > mxCount)
            {
                mxCount = Math.max(mxCount, count);
                row = i;
            }
            count = 0;
        }

        return new int[]{row, mxCount};
    }
}