package org.example.humancloud;

public class p6 {
    public static void main(String[] args) {
        int[] arr = {11, 2, 7, 15};
        int n = 9;
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                while (arr[i] + arr[i + 1] == n) {
                    System.out.println(arr[i] + ":" + arr[i + 1]);
                    break;
                }
            }
        }
    }
}
