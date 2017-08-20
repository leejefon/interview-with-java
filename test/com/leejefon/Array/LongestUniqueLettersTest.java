package com.leejefon.Array;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jefflee on 8/18/17.
 */
public class LongestUniqueLettersTest {
    @Test
    public void test1() throws Exception {
        Assert.assertEquals(3, LongestUniqueLetters.exec("abcabcbb"));
    }
}
