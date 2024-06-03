package org.example.humancloud;

public class p8 {
    //    Write a function to convert a string of digits to an integer withiut type casting and parsing functions
    public static void main(String[] args) {
//        String str = "1234k56";
        String str = "123k56";
        int intValue = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
//            if (Character.isDigit(ch)) {
//                int digit = Character.getNumericValue(ch);
//                System.out.println(digit + ":digit");
//            } else if (Character.isLetter(ch)) {
//                System.out.println(str.charAt(i) + " :char");
//            }
            if (ch >= '0' && ch <= '9') {
                intValue = intValue * 10 + (ch - '0');
            } else {
                // Handle non-digit characters if needed
                System.out.println("Non-digit character encountered: " + ch);
            }

        }
    }
}
