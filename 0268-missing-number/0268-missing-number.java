class Solution {
    public int missingNumber(int[] nums) {
        int total=0;
        for(int i=0; i<nums.length; i++){
            total+=nums[i];
        }
        int size=nums.length;
        int mis=size*(size+1)/2;
        return mis-total;
    }
}