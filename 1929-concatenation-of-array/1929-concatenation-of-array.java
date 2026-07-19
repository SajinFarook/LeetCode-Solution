class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans=new int[nums.length+nums.length];
        for(int i=0;i<ans.length;i++){
            ans[i]=nums[i%nums.length];
        }
        return ans;
    }
}