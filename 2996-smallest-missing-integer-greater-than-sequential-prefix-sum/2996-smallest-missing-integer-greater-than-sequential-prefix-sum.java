class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length ;

        Set<Integer> set = new HashSet<>();

        int sum = nums[0] , i = 1;

        while (i < n && nums[i] == nums[i-1] + 1){
            sum += nums[i] ;
            i++;
        }

        for(int num : nums) set.add(num) ;
        
        while (set.contains(sum))sum++ ;
        return sum ;
    }
}