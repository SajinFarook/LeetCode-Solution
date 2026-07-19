class Solution {
    public int largestAltitude(int[] gain) {
        int maximum_alt=0;
        int sum=0;
        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            maximum_alt=Math.max(maximum_alt,sum);
        }
        return maximum_alt;
    }
}