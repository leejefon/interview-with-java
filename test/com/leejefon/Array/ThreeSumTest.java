package com.leejefon.Array;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumTest {
    @Test
    public void test1() {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> result = new ArrayList<>();

        result.add(Arrays.asList(-1, -1, 2));
        result.add(Arrays.asList(-1, 0 , 1));

        Assert.assertEquals(result.toString(), ThreeSum.exec(nums).toString());
    }
}
