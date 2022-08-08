package org.hillel.lessons.hashmap;

import java.util.HashMap;
import java.util.Map;

public class LessonTask {

    public static void main(String[] args) {

        String vol = "aeoui";
        String s = "asoodfghjaaaeeehreiiiwazxuucvbn";

        Map<Character, Integer> volMap = new HashMap<>();
        for (char element : vol.toCharArray()) {
            volMap.put(element, 0);
        }

        for (int i = 0; i < s.length(); i++) {
            char keyChar = s.charAt(i);
            if (volMap.containsKey(keyChar)) {
                Integer count = volMap.get(keyChar);
                volMap.put(keyChar, ++count);
            }
        }

        System.out.println(volMap);

    }
}

//        char[] chars = vol.toCharArray();
//
//        for (int i = 0; i < chars.length; i++) {
//
//            char temp = chars[i];
//            int count = 0;
//
//            char[] array = s.toCharArray();
//            for (int j = 0; j < array.length; j++) {
//                if (temp == array[j]) {
//                    count++;
//                }
//            }
//            System.out.println("Char " + temp + "=" + count);
//        }
//    }

