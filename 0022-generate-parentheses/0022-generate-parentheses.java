class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> resultList = new ArrayList<>();
        backTrack(resultList, "", 0, 0, n);

        return resultList;
    }

    private void backTrack(List<String> resultList, String temp, int open, int closed, int n)
    {
        if(temp.length() == n * 2)
        {
            resultList.add(new String(temp));
            return;
        }

        if(open < n)
        {
            backTrack(resultList, temp + "(", open + 1, closed, n);
        }

        if(closed < open){
            backTrack(resultList, temp + ")", open, closed + 1, n);
        }
    }
}