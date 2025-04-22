package io.neetcode;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s="Was it a car or a cat I saw?";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        System.out.println(s);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch) || Character.isLetter(ch)) {
                sb.append(ch);
            }
        }
        System.out.println(sb);
        int n = sb.length() - 1;
        for (int i = 0; i < (n / 2); i++) {
            if (sb.charAt(i) != sb.charAt(n - i)) {
                return false;
            }
        }
        return true;
    }
}
