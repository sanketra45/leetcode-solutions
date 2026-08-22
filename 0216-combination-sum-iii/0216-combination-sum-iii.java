class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> resultList = new ArrayList<>();

        backTrack(1, resultList, new ArrayList<>(), k, n);

        return resultList;
    }

    private void backTrack(int index, List<List<Integer>> resultList, List<Integer> list, int k, int n)
    {
        if(n == 0 && list.size() == k)
        {
            resultList.add(new ArrayList<>(list));
            return;
        }

        if(n < 0 || list.size() >= k) return;

        for(int i = index; i <= 9; i++)
        {
            if(i > n) break;
            list.add(i);

            backTrack(i + 1, resultList, list, k, n - i);

            list.remove(list.size() - 1);
        }
    }
}