class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int startRow = 0, startCol = 0;
        int endRow = m - 1, endCol = n - 1;
        List<Integer> list = new ArrayList<>();

        while(startRow <= endRow && startCol <= endCol)
        {
            for(int i = startCol; i <= endCol; i++)
            {
                list.add(matrix[startRow][i]);
            }

            for(int i = startRow + 1; i <= endRow; i++)
            {
                list.add(matrix[i][endCol]);
            }

            for(int i = endCol - 1; i >= startCol; i--)
            {
                if(startRow == endRow) break;
                list.add(matrix[endRow][i]);
            }

            for(int i = endRow - 1; i >= startRow + 1; i--)
            {
                if(startCol == endCol) break;
                list.add(matrix[i][startCol]);
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

        

        return list;
    }
}