class Solution {
    public int search(int[] nums, int target) {
        int first=0;
        int last=nums.length-1;
        while(first<=last){
            int middle=last+(first-last)/2;
            if(target==nums[middle]){
                return middle;
            }
            else if(target<nums[middle]){
                last=middle-1;
            }
            else if(target>nums[middle]){
                first=middle+1;
            }
        }
        return -1;
    }
}