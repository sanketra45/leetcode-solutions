class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        //  IN THIS PROBLEM, WE HAVE TWO CHOICES EITHER WE PICK THE ELEMENT TO FORM THE COMBINATIONS OR NOT
        // FIRST WE PICK THE CURRENT ELEMENT IF THE SUM IS NOT FORMED THEN WE REMOVE IT AND BACKTRACK WITH ANOTHER ELEMENT
        // ADD THE COMBINATIONS IN THE RESULT LIST AND RETUEN IT
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        backTrack(0, target, result, list, candidates);

        return result;
    }

    private void backTrack(int index, int target, List<List<Integer>> result, List<Integer> list, int[] candidates)
    {
        if(target == 0)
        {
            result.add(new ArrayList<>(list));
            return;
        }

        if(index == candidates.length || target < 0) return;

        list.add(candidates[index]);
        backTrack(index, target - candidates[index], result, list, candidates);
        list.remove(list.size() - 1);

        backTrack(index + 1, target, result, list, candidates);
    }
}