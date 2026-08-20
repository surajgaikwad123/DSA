class Solution {
    public boolean isPalindrome(int x) {
        int og = x;
        int temp =  0;
        int result = 0;
        
        if(x<0)
        {
            return false;
        }
        else
        {
            while(x != 0)
            {
                temp = x%10;
                result = result *10 +temp;
                x = x/10;
            }
            if(result == og)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}