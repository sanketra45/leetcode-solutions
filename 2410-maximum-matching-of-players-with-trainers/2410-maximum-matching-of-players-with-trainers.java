class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        
        int left = 0, right = 0;

        Arrays.sort(players);
        Arrays.sort(trainers);

        while(left < trainers.length && right < players.length)
        {
            if(players[right] <= trainers[left])
            {
                right++;
            }
            left++;
        }

        return right;
    }
}