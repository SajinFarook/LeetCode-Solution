class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] mergearr=new int[m+n];
        for(int i=0;i<m;i++){
            mergearr[i]=nums1[i];
        }
        for(int i=0;i<n;i++){
            mergearr[m+i]=nums2[i];
        }
        for(int i=0;i<mergearr.length-1;i++){
            for(int j=0;j<mergearr.length-i-1;j++){
                if(mergearr[j]>mergearr[j+1]){
                    int temp=mergearr[j];
                    mergearr[j]=mergearr[j+1];
                    mergearr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<m+n;i++){
            nums1[i]=mergearr[i];
        }
    }
}