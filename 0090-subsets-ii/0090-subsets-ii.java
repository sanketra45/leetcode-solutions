class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> resultList = new ArrayList<>();

        backTrack(resultList, new ArrayList<>(), nums, 0);

        return resultList;
    }
        private void backTrack(List<List<Integer>> resultList, List<Integer> tempList, int[] nums, int start)
        {
            resultList.add(new ArrayList<>(tempList));

            for(int i = start; i < nums.length; i++)
            {
                if(i > start && nums[i] == nums[i - 1]) continue;

                tempList.add(nums[i]);

                backTrack(resultList, tempList, nums, i + 1);

                tempList.remove(tempList.size() - 1);
            }
        }
}