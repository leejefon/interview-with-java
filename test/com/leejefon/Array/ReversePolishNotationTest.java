package com.leejefon.Array;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jefflee on 8/18/17.
 */
public class ReversePolishNotationTest {
    @Test
    public void test1() throws Exception {
        String[] test = { "3", "2", "+" };
        Assert.assertEquals(5.0, ReversePolishNotation.exec(test), 0.0f); // NOTE: need the delta to pass
    }
}
