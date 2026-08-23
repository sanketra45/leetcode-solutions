class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();

        boolean[] used = new boolean[nums.length]; 

        backTrack(resultList, new ArrayList<>(), nums, used);

        return resultList;
    }

    private void backTrack(List<List<Integer>> resultList, List<Integer> tempList, int[] nums, boolean[] used)
    {
        if(tempList.size() == nums.length)
        {
            if(!resultList.contains(tempList)){
                resultList.add(new ArrayList<>(tempList));
            }
            return;
        }

        for(int i = 0; i < nums.length; i++)
        {
            if(used[i]) continue;

            used[i] = true;

            tempList.add(nums[i]);

            backTrack(resultList, tempList, nums, used);

            tempList.remove(tempList.size() - 1);

            used[i] = false;
        }
    }
}