package org.example.humancloud;

public class p2 {
    public static void main(String[] args) {
        int n = 120;
        int original=n;
        int rev=0;
        while (n!=0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        if (original==rev){
            System.out.println("p");
        }
    }
}
