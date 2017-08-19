package com.leejefon.Array;

import junit.framework.TestCase;

/**
 * Created by jefflee on 8/18/17.
 */
public class LongestUniqueLettersTest extends TestCase {
    public void test1() throws Exception {
        assertEquals(3, LongestUniqueLetters.exec("abcabcbb"));
    }
}
