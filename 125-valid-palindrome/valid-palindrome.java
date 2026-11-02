class Solution {
    public boolean isPalindrome(String s) {

        Boolean out = false;

        String norm = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        String rev = new StringBuilder(norm).reverse().toString();

        if(norm.equals(rev))
        {
            out = true;
        }
        
        return out;
        
    }
}