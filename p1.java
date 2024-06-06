package org.example.humancloud;

import java.util.HashMap;
import java.util.Map;

public class p1 {
    public static void main(String[] args) {
        String string = "abrancadabrab";

        char[] chars = string.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < chars.length; i++) {
//            char c=' ';
//            int count=0;
//            for (int j = i + 1; j < chars.length; j++) {
//                if (chars[i] == chars[j]) {
//                    map.put(chars[i], map.get(chars[i]) + 1);
//                } else {
//                    map.put(chars[i], 1);
//                }
//            }
        for (char a : chars) {
            map.put(Character.valueOf(a), map.getOrDefault(Character.valueOf(a), 0) + 1);
        }

//        final var entry = map.entrySet().stream().min(Map.Entry.comparingByValue()).get();
//        System.out.println(entry);
//                max += entry.getValue();
//                r= entry.getKey();
//            }
//        }
//        System.out.println(max + " :" + r);
    }
}
