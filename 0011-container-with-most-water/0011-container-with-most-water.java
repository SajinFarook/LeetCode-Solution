class Solution {
    public int maxArea(int[] height) {
        int r=height.length-1;
        int l=0;
        int maxarea=0;
        while(l<r){
            int h=Math.min(height[l],height[r]);
            int w=r-l;
            int area=h*w;
            maxarea=Math.max(area,maxarea);
            
            if(height[l]>height[r]){
                r--;
            }
            else{
                l++;
            }
        }
        return maxarea;
    }
}