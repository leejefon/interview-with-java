package com.leejefon.Array;

import java.util.Map;
import java.util.HashMap;

/**
 * Created by jefflee on 8/17/17.
 */
public class LongestUniqueLetters {
    public static int exec(String str) {
        String longestStr = "";
        int longestCount = 0;

        for (int i = 0; i < str.length(); i++) {
            int index = longestStr.indexOf(str.charAt(i));
            if (index == -1) {
                longestStr = longestStr + str.charAt(i);
                longestCount = Math.max(longestCount, longestStr.length());
            } else {
                longestStr = longestStr.substring(index + 1) + str.charAt(i);
            }
        }

        return longestCount;
    }
}
