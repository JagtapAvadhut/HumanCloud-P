package org.example.humancloud;

public class p3 {
    public static void main(String[] args) {
        int[] arr = {123, 121, 454, 567};

        // Loop through the array to check for palindromes
        for (int i = 0; i < arr.length; i++) {
            String string = String.valueOf(arr[i]);
            int left = 0;
            int right = string.length() - 1;
            boolean a = true;
            while (left < right) {
                if (string.charAt(left) != string.charAt(right)) {
                    a = false;
                    break;
                } else {
//                    a = true;
                }
                left++;
                right--;
            }
            if (a) {
                System.out.println(arr[i]);
            }

//            if (isPalindrome(arr[i])) {
//                System.out.println(arr[i] + " is a palindrome");
//            }
        }
    }

    // Helper method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;

        // Reverse the number
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }

        // Check if the original number is equal to its reverse
        return original == reversed;
    }

}
