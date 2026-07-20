class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        boolean notfound=true;
        int largest=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==-nums[j]){
                    largest=Math.max(largest,Math.abs(nums[i]));
                    notfound=false;
                }
            }
        }
        if(notfound){
            return -1;
        }
        else{
            return largest;
        }
    }
}