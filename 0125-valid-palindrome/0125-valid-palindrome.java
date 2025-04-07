class Solution {
    public boolean isPalindrome(String s) {
       int lo = 0;
       int hi = s.length() - 1;

       while (lo < hi) {
        while (lo < hi && !Character.isLetterOrDigit(s.charAt(lo))) lo++;
        while (lo < hi && !Character.isLetterOrDigit(s.charAt(hi))) hi--;

        if (Character.toLowerCase(s.charAt(lo)) != Character.toLowerCase(s.charAt(hi))) return false;
        lo++;
        hi--;
       }

       return true;
    }
}
