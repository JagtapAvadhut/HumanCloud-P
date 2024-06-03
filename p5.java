package org.example.humancloud;

import java.util.Arrays;
import java.util.Comparator;

public class p5 {
    public static void main(String[] args) {
        int[] arr = {12, 43, 5, 83, 89, 8, 54};
        final var collect = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder())
                .limit(3)
                .mapToInt(a -> a).sum();
        System.out.println(collect);
    }
}
