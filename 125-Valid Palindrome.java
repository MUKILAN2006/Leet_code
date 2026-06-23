class Solution {
    public boolean isPalindrome(String s) {
        if(s==null)
            return false;
        String clean=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String reversed= new StringBuilder(clean).reverse().toString();
        return clean.equals(reversed);
    }
}