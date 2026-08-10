class Solution {
    public int mirrorDistance(int n) {
        StringBuilder rev=new StringBuilder(Integer.toString(n));
        rev.reverse();
        return(Math.abs(n-Integer.parseInt(rev.toString())));
    }
}