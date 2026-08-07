class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int r=0;
        int l=0;
        int count=0;
        while(r<g.length && l<s.length){
            if(s[l]>=g[r]){
                r++;
            }
            l++;
        }
        return r;
    }
}