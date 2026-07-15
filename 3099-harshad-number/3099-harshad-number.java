class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int temp = x;
        int sum =0;
        while(x>0){
            int rev = x%10;
            sum +=rev;
            x=x/10;
        }
        if(temp%sum==0){
            return sum;
        }
        else{
            return -1;
        }
    }
}