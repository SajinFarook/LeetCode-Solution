class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int fren[]=new int[nums.length];
        int res[]=new int[2];
        int index=0;
        for(int num:nums){
            fren[num]++;
        }

        for(int i=0;i<nums.length;i++){
            if(fren[i]==2){
                res[index++]=i;
            }
        }
        return res;
    }
}