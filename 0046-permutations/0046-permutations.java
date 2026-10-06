class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> resultList = new ArrayList<>();

        backTrack(resultList, new ArrayList<>(), nums);
        return resultList;
    }


    private void backTrack(List<List<Integer>> resultList, List<Integer> tempList, int[] nums)
        {
            // IF WE MATCH THE REQ LENGTH IT IS THE PERMUTATION (n!)
            if(tempList.size() == nums.length)
            {
                resultList.add(new ArrayList<>(tempList));  
                return;
            }

            for(int num : nums)
            {
                // SKIP IF WE GET THE SAME NUMBER (AVOID DUPLICATE NUMBER)
                if(tempList.contains(num)) continue;

                // ADD FIRST NUMBER OF THE PERMUTATION
                tempList.add(num);

                // BACKTRACK AND TRY OTHER ELEMENTS
                backTrack(resultList, tempList, nums);

                // REMOVE THE LAST ELEMENT
                tempList.remove(tempList.size() - 1);
            }
        }
}