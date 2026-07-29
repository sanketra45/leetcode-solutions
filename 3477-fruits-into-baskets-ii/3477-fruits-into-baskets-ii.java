class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean[] visited = new boolean[baskets.length];
        int count = 0;
        for(int i = 0; i < fruits.length; i++)
        {
            for(int j = 0; j < baskets.length; j++)
            {
                if(fruits[i] <= baskets[j] && visited[j] == false)
                {
                    visited[j] = true;
                    count++;
                    break;
                }
            }
        }

        return fruits.length - count;
    }
}