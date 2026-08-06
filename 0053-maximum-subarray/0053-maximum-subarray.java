class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int currentsum=0;
        for(int n:nums){
            currentsum+=n;

            max=Math.max(max,currentsum);

            if(currentsum<0){
                currentsum=0;
            }
        }
        return max;
    }
}