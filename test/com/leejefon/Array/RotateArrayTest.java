package com.leejefon.Array;

import org.junit.Test;
import org.junit.Assert;

/**
 * Created by jefflee on 8/19/17.
 */
public class RotateArrayTest {
    @Test
    public void test1() throws Exception {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int[] result = { 5, 6, 7, 1, 2, 3, 4 };
        int k = 3;

        RotateArray.exec(arr, k);
        Assert.assertArrayEquals(result, arr); // NOTE: need the delta to pass
    }
}
