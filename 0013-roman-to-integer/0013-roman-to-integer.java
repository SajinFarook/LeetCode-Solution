class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> roman=new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        int result=roman.get(s.charAt(s.length()-1));
        for(int n=s.length()-2;n>=0;n--){
            if(roman.get(s.charAt(n))>=roman.get(s.charAt(n+1))){
                result+=roman.get(s.charAt(n));
            }
            else{
                result-=roman.get(s.charAt(n));
            }
        }
        return result;
    }
}