package org.example.humancloud;

public class p7 {
    public static void main(String[] args) {
        String string = "abba";
        String buffer = String.valueOf(new StringBuffer(string).reverse());
        int l1 = string.length();
        int l2 = buffer.length();
//        if (l1 == l2 && string.equals(buffer)) {
//            System.out.println("equal");
//        }
        System.out.println(isPalindrome(string)?"equal":"not");

    }

    public static boolean isPalindrome(String str) {
        int start = 0;
        int last = str.length() - 1;
        while (start<last){
            if (str.charAt(start)!=str.charAt(last)){
                return false;
            }
            start++;
            last--;
        }
        return true;
    }
}
