class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res=new ArrayList<>();
        Arrays.sort(nums);

        int first = nums[0];
        int last = nums[nums.length - 1];

        for (int i = first; i <= last; i++) {
            boolean found = false;

            for (int n : nums) {
                if (n == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                res.add(i);
            }
        }

        return res;
    }
}