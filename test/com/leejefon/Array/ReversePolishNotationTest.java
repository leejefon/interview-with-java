package com.leejefon.Array;

import junit.framework.TestCase;

/**
 * Created by jefflee on 8/18/17.
 */
public class ReversePolishNotationTest extends TestCase {
    public void test1() throws Exception {
        String[] test = { "3", "2", "+" };
        assertEquals(5.0, ReversePolishNotation.exec(test), 0.0f); // NOTE: need the delta to pass
    }
}
