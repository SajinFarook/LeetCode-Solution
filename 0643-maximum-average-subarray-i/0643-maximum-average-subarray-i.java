class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i < k; i++)
        {
            sum = sum + nums[i];
        }
        int maxsum = sum;
        int startindex = 0;
        int endindex = k;
        while(endindex < n)
        {
            sum = sum - nums[startindex];
            startindex++;
            sum = sum + nums[endindex];
            endindex++;
            maxsum = Math.max(maxsum,sum);
        }
        return (double) maxsum/k;
    }
}