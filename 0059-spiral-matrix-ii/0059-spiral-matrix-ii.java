class Solution {
    public int[][] generateMatrix(int n) {
        int startRow = 0, startCol = 0;
        int endRow = n - 1, endCol = n - 1;
        int index = 1;

        int[][] result = new int[n][n];

        while(startRow <= endRow && startCol <= endCol)
        {
            for(int i = startCol; i <= endCol; i++)
            {
                result[startRow][i] = index++;
            }

            for(int i = startRow + 1; i <= endRow; i++)
            {
                result[i][endCol] = index++;
            }

            for(int i = endCol - 1; i >= startCol; i--)
            {
                result[endRow][i] = index++;
            }

            for(int i = endRow - 1; i >= startRow + 1; i--)
            {
                result[i][startCol] = index++;
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        
        return result;
    }
}