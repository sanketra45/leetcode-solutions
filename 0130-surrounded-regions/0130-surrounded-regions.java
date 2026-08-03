class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        for(int i = 0; i < m; i++)
        {
            if(board[i][0] == 'O')
            {
                bfs(board, i, 0);
            }
            
            if(board[i][n - 1] == 'O')
            {
                bfs(board, i, n - 1);
            }
        }

        for(int j = 0; j < n; j++)
        {
            if(board[0][j] == 'O')
            {
                bfs(board, 0, j);
            }

            if(board[m - 1][j] == 'O')
            {
                bfs(board, m - 1, j);
            }
        }

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(board[i][j] == 'O')
                {
                    board[i][j] = 'X';
                }

                else if(board[i][j] == '#')
                {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void bfs(char[][] board, int row, int cols)
    {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {row, cols});

        while(!queue.isEmpty())
        {
            int[] curr = queue.poll();
            int i = curr[0];
            int j = curr[1];
            
            if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != 'O') continue;

            board[i][j] = '#';

            queue.offer(new int[] {i, j + 1});
            queue.offer(new int[] {i, j - 1});
            queue.offer(new int[] {i + 1, j});
            queue.offer(new int[] {i - 1, j});
        }
    }
}