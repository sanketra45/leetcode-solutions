class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> resultList = new ArrayList<>();
        Arrays.sort(candidates);
        backTrack(0, resultList, new ArrayList<>(), target, candidates);

        return resultList;
    }

    private void backTrack(int index, List<List<Integer>> resultList, List<Integer> list, int target, int[] candidates)
    {
        if(target == 0)
        {
            resultList.add(new ArrayList<>(list));
            return;
        }

        if(index == candidates.length || target < 0) return;

        for(int i = index; i < candidates.length; i++)
        {
            if(i > index && candidates[i] == candidates[i - 1]) continue;
            if(candidates[i] > target) break;

            list.add(candidates[i]);

            backTrack(i + 1, resultList, list, target - candidates[i], candidates);

            list.remove(list.size() - 1);
        }
    }
}