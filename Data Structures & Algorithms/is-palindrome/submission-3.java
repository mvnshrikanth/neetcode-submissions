class Solution {
    public boolean isPalindrome(String s) {
        String main = "";
        String reverse = "";

        System.out.println(s.length());
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && Character.isLetterOrDigit(s.charAt(i))) {
                main = main + s.charAt(i);
                reverse = s.charAt(i) + reverse;
            }
        }

        if (main.toUpperCase().equals(reverse.toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }
}
