class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> resultList = new ArrayList<>();

        backTrack(resultList, new ArrayList<>(), n, k, 1);

        return resultList;
    }

    private void backTrack(List<List<Integer>> resultList, List<Integer> tempList, int n, int k, int start)
    {
        if(tempList.size() == k)
        {
            resultList.add(new ArrayList<>(tempList));
            return;
        }

        for(int i = start; i <= n; i++)
        {
            if(tempList.contains(i)) continue;
            tempList.add(i);

            backTrack(resultList, tempList, n, k, i + 1);

            tempList.remove(tempList.size() - 1);
        }
    }
}