class Solution {
    public void reverseString(char[] s) {
        int size=s.length;
        int pt1=0;
        int pt2=size-1;
        while(pt1<pt2){
            char temp=s[pt1];
            s[pt1]=s[pt2];
            s[pt2]=temp;
            pt1++;
            pt2--;
        }
    }
}