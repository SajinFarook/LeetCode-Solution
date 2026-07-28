class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // Count frequencies
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // Convert to Integer[]
        Integer[] arr = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        // Sort
        Arrays.sort(arr, (a, b) -> {
            if (map.get(a).equals(map.get(b))) {
                return b - a; // larger number first
            }
            return map.get(a) - map.get(b); // smaller frequency first
        });
        // Convert back
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }
        return nums;
    }
}