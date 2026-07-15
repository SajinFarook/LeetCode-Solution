class Solution {
    public int climbStairs(int n) {
        int arr[]=new int[n];
        int f1=0;
        int f2=1;
        int i=0;
        if(n<=2) return n;
        while(n>0){
            int f3=f1+f2;
            f1=f2;
            f2=f3;
            arr[i]=f3;
            i++;
            n--;
        }
        return arr[arr.length-1];
    }
}