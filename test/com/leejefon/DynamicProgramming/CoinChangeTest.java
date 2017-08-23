package com.leejefon.DynamicProgramming;

import org.junit.Assert;
import org.junit.Test;

public class CoinChangeTest {
    @Test
    public void test1() {
        int[] coins = {1, 2, 5};
        int amount = 11;
        int result = 3;

        Assert.assertEquals(result, CoinChange.exec(coins, amount));
    }
}
