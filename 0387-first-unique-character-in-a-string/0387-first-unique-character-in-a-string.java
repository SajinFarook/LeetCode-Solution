class Solution {
    public int firstUniqChar(String s) {
         for (int i = 0; i < s.length(); i++) {
            boolean non = true;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    non = false;
                    break;
                }
            }
            if (non) {
                return i;
            }
        }
        return -1;
    }
}