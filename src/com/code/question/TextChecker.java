package com.code.question;

public class TextChecker {

    public boolean isPalindrome(String text) {
        if (text == "" || text == null) {
            return false;
        }
        String reverseText = new StringBuffer(text).reverse().toString();
        return text.equals(reverseText);
    }
}
